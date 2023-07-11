package code;

import static code.Instruction.INSTR_MEM_SIZE;
import static code.OpCode.ADDf;
import static code.OpCode.ADDi;
import static code.OpCode.B2Ss;
import static code.OpCode.BOFb;
import static code.OpCode.BOTb;
import static code.OpCode.CALL;
import static code.OpCode.CATs;
import static code.OpCode.DIVf;
import static code.OpCode.DIVi;
import static code.OpCode.EQUf;
import static code.OpCode.EQUi;
import static code.OpCode.EQUs;
import static code.OpCode.HALT;
import static code.OpCode.I2Ss;
import static code.OpCode.JUMP;
import static code.OpCode.LDIf;
import static code.OpCode.LDIi;
import static code.OpCode.LDWf;
import static code.OpCode.LDWi;
import static code.OpCode.LTHf;
import static code.OpCode.LTHi;
import static code.OpCode.LTHs;
import static code.OpCode.MULf;
import static code.OpCode.MULi;
import static code.OpCode.OROR;
import static code.OpCode.R2Ss;
import static code.OpCode.STWf;
import static code.OpCode.STWi;
import static code.OpCode.SUBf;
import static code.OpCode.SUBi;
import static code.OpCode.WIDf;
import static typing.Type.BOOL_TYPE;
import static typing.Type.INT_TYPE;
import static typing.Type.REAL_TYPE;

import ast.AST;
import ast.ASTBaseVisitor;
import tables.StrTable;
import tables.VarTable;
import typing.Type;

/*
 * Visitador da AST para geração básica de código. Funciona de
 * forma muito similar ao interpretador do laboratório anterior,
 * mas agora estamos trabalhando com um ambiente de execução
 * com código de 3 endereços. Isto quer dizer que não existe mais
 * pilha e todas as operações são realizadas via registradores.
 *
 * Note que não há uma área de memória de dados no código abaixo.
 * Esta área fica agora na TM, que é a "arquitetura" de execução.
 */
public final class CodeGen extends ASTBaseVisitor<Integer> {

	private final Instruction code[]; // Code memory
	private final StrTable st;
	private final VarTable vt;

	// Contadores para geração de código.
	// Próxima posição na memória de código para emit.
	private static int nextInstr;
	// Número de registradores temporários já utilizados.
	// Usamos um valor arbitrário, mas depois seria necessário
	// fazer o processo de alocação de registradores. Isto está
	// fora do escopo da disciplina.
	private static int intRegsCount;
	private static int floatRegsCount;

	public CodeGen(StrTable st, VarTable vt) {
		this.code = new Instruction[INSTR_MEM_SIZE];
		this.st = st;
		this.vt = vt;
	}

	// Função principal para geração de código.
	@Override
	public void execute(AST root) {
		nextInstr = 0;
		intRegsCount = 0;
		floatRegsCount = 0;
	    dumpStrTable();
	    visit(root);
	    emit(HALT);
	    dumpProgram();
	}

	// ----------------------------------------------------------------------------
	// Prints ---------------------------------------------------------------------

	void dumpProgram() {
	    for (int addr = 0; addr < nextInstr; addr++) {
	    	System.out.printf("%s\n", code[addr].toString());
	    }
	}

	void dumpStrTable() {
	    for (int i = 0; i < st.size(); i++) {
	        System.out.printf("SSTR %s\n", st.get(i));
	    }
	}

	// ----------------------------------------------------------------------------
	// Emits ----------------------------------------------------------------------

	private void emit(OpCode op, int o1, int o2, int o3) {
		Instruction instr = new Instruction(op, o1, o2, o3);
		// Em um código para o produção deveria haver uma verificação aqui...
	    code[nextInstr] = instr;
	    nextInstr++;
	}

	private void emit(OpCode op) {
		emit(op, 0, 0, 0);
	}

	private void emit(OpCode op, int o1) {
		emit(op, o1, 0, 0);
	}

	private void emit(OpCode op, int o1, int o2) {
		emit(op, o1, o2, 0);
	}

	private void backpatchJump(int instrAddr, int jumpAddr) {
	    code[instrAddr].o1 = jumpAddr;
	}

	private void backpatchBranch(int instrAddr, int offset) {
	    code[instrAddr].o2 = offset;
	}

	// ----------------------------------------------------------------------------
	// AST Traversal --------------------------------------------------------------

	private int newIntReg() {
		return intRegsCount++;
	}

	private int newFloatReg() {
		return floatRegsCount++;
	}

	// Funcionamento dos visitadores abaixo deve ser razoavelmente explicativo
	// neste final do curso...

	// TODO
	@Override
	protected Integer visitAssign(AST node) {

		int dir;
		dir = visit(node.getChild(1));

		int varIdx = node.getChild(0).intData;
		

		if (node.getChild(0).type.equals(Type.REAL_TYPE)) {
			emit(STWf, varIdx, dir);
		}
		else {
			emit(STWi, varIdx, dir);
		}

	    return -1; // This is not an expression, hence no value to return.
	}

	// TODO
	@Override
	protected Integer visitEq(AST node) {
		Type type = node.type;
		int esq;
		int dir;
		int x;
		esq = visit(node.getChild(0));
		dir = visit(node.getChild(1));

		switch(type) {
			case INT_TYPE:
				x = newIntReg();
				emit(EQUi, x, esq, dir);
				break;
			case REAL_TYPE:
				x = newFloatReg();
				emit(EQUf, x, esq, dir);
				break;
			case BOOL_TYPE:
				x = newIntReg();
				emit(EQUi, x, esq, dir);
				break;
			default:
				// FAZER ALGO PRA STRING AQUI?????
				x = newIntReg();
				emit(EQUs, x, esq, dir);
				break;
		}

		return x; 
	}

	// TODO
	@Override
	protected Integer visitBlock(AST node) {
		for (int i = 0; i < node.getChildCount(); i++) {
			visit(node.getChild(i));
		}
	    return -1; // This is not an expression, hence no value to return.
	}

	// TODO
	@Override
	protected Integer visitBoolVal(AST node) {
		int x = newIntReg();
		int c = node.intData;

	    emit(LDIi, x, c);

        return x; // FIXME Return a proper value here.
	}

	// TODO
	@Override
	protected Integer visitIf(AST node) {
		int x = visit(node.getChild(0));

		int offInit = nextInstr;
		emit(BOFb, x, 0);

		visit(node.getChild(1));

		backpatchBranch(offInit,nextInstr-offInit+1); 

		if(node.children.size() == 3) {
			int jumpInit = nextInstr;
			emit(JUMP, 0);
			visit(node.getChild(2));
			backpatchJump(jumpInit, nextInstr);
		}

		return -1; // This is not an expression, hence no value to return.
	}

	// TODO
	@Override
	protected Integer visitIntVal(AST node) {
		int x = newIntReg();
		int c = node.intData;

	    emit(LDIi, x, c);

		return x; // FIXME Return a proper value here.
	}

	// TODO
	@Override
	protected Integer visitLt(AST node) {
		Type type = node.type;
		int esq;
		int dir;
		int x;
		esq = visit(node.getChild(0));
		dir = visit(node.getChild(1));

		switch(type) {
			case INT_TYPE:
				x = newIntReg();
				emit(LTHi, x, esq, dir);
				break;
			case REAL_TYPE:
				x = newFloatReg();
				emit(LTHf, x, esq, dir);
				break;
			default:
				// FAZER ALGO PRA STRING AQUI?????
				x = newIntReg();
				emit(LTHs, x, esq, dir);
				break;
		}

		return x; 
	}

	// TODO
	@Override
	protected Integer visitMinus(AST node) {
		Type type = node.type;
		int esq;
		int dir;
		int x;
		esq = visit(node.getChild(0));
		dir = visit(node.getChild(1));

		switch(type) {
			case INT_TYPE:
				x = newIntReg();
				emit(SUBi, x, esq, dir);
				break;
			case REAL_TYPE:
				x = newFloatReg();
				emit(SUBf, x, esq, dir);
				break;
			default:
				x = newIntReg();
				break;
		}

		return x; // FIXME Return a proper value here.
	}

	// TODO
	@Override
	protected Integer visitOver(AST node) {
		Type type = node.type;
		int esq;
		int dir;
		int x;
		esq = visit(node.getChild(0));
		dir = visit(node.getChild(1));

		switch(type) {
			case INT_TYPE:
				x = newIntReg();
				emit(DIVi, x, esq, dir);
				break;
			case REAL_TYPE:
				x = newFloatReg();
				emit(DIVf, x, esq, dir);
				break;
			default:
				x = newIntReg();
				break;
		}
		return x; // FIXME Return a proper value here.
	}

	// TODO
	@Override
	protected Integer visitPlus(AST node) {

		Type type = node.type;
		int esq;
		int dir;
		int x;
		esq = visit(node.getChild(0));
		dir = visit(node.getChild(1));

		switch(type) {
			case INT_TYPE:
				x = newIntReg();
				emit(ADDi, x, esq, dir);
				break;
			case REAL_TYPE:
				x = newFloatReg();
				emit(ADDf, x, esq, dir);
				break;
			default:
				x = newIntReg();
				break;
		}

		return x; // FIXME Return a proper value here.
	}

	@Override
	protected Integer visitProgram(AST node) {
		visit(node.getChild(0)); // var_list
		visit(node.getChild(1)); // block
	    return -1;  // This is not an expression, hence no value to return.
	}

	// TODO
	@Override
	protected Integer visitRead(AST node) {
		Type type = node.getChild(0).type;
		int addr = node.getChild(0).intData;
		int x = newIntReg();

		switch(type) {
			case INT_TYPE:
				emit(CALL, 0, addr);
				emit(STWi, addr, x); 
				break;
			case REAL_TYPE:
				emit(CALL, 1, addr);
				emit(STWf, addr, x);
				break;
			case BOOL_TYPE:
				emit(CALL, 2, addr);
				emit(STWi, addr, x);
				break;
			case STR_TYPE:
				emit(CALL, 3, addr);
				// emit(SSTR, addr);
				break;
			default:
				break;
		}

	    return addr;  // This is not an expression, hence no value to return.
	}

	@Override
	protected Integer visitRealVal(AST node) {
		int x = newFloatReg();
	    // We need to read as an int because the TM cannot handle floats directly.
	    // But we have a float stored in the AST, so we just convert it as an int
	    // and magically we have a float encoded as an int... :P
	    int c = Float.floatToIntBits(node.floatData);
	    emit(LDIf, x, c);
	    return x;
	}

	// TODO
	@Override
	protected Integer visitRepeat(AST node) {
		
		int offInit = nextInstr;
		visit(node.getChild(0));
		int y = visit(node.getChild(1));
		int off = offInit - nextInstr;

		emit(BOFb, y, off);

	    return -1;  // This is not an expression, hence no value to return.
	}

	@Override
	protected Integer visitStrVal(AST node) {
		int x = newIntReg();
	    int c = node.intData;
	    emit(LDIi, x, c);
	    return x;
	}

	// TODO
	@Override
	protected Integer visitTimes(AST node) {
		Type type = node.type;
		int esq;
		int dir;
		int x;
		esq = visit(node.getChild(0));
		dir = visit(node.getChild(1));

		switch(type) {
			case INT_TYPE:
				x = newIntReg();
				emit(MULi, x, esq, dir);
				break;
			case REAL_TYPE:
				x = newFloatReg();
				emit(MULf, x, esq, dir);
				break;
			default:
				x = newIntReg();
				break;
		}

		return x; // FIXME Return a proper value here.
	}

	@Override
	protected Integer visitVarDecl(AST node) {
		// Nothing to do here.
	    return -1;  // This is not an expression, hence no value to return.
	}

	@Override
	protected Integer visitVarList(AST node) {
		// Nothing to do here.
	    return -1;  // This is not an expression, hence no value to return.
	}

	// TODO
	@Override
	protected Integer visitVarUse(AST node) {
		Type type = node.type;
		int addr = node.intData;
		int x;

		switch(type) {
			case INT_TYPE:
				x = newIntReg();
				emit(LDWi, x, addr);
				break;
			case REAL_TYPE:
				x = newFloatReg();
				emit(LDWf, x, addr);
				break;
			case STR_TYPE:
				x = newIntReg();
				emit(LDWi, x, addr);
				break;
			default:
				x = newIntReg();
				break;
		}
		// CONSERTAR ESSE AQ PROXIMO

		
		return x; // FIXME Return a proper value here.
	}

	// TODO
	@Override
	protected Integer visitWrite(AST node) {
		Type type = node.getChild(0).type;		
		int x = visit(node.getChild(0));

		switch(type) {
			case INT_TYPE:
				emit(CALL, 4, x);
				break;
			case REAL_TYPE:
				emit(CALL, 5, x);
				break;
			case BOOL_TYPE:
				emit(CALL, 6, x);
				break;
			case STR_TYPE:
				emit(CALL, 7, x);
				break;
			default:
				break;
		}
	    return -1;  // This is not an expression, hence no value to return.
	}

	// TODO
	@Override
	protected Integer visitB2I(AST node) {
		return -1; // FIXME Return a proper value here.
	}

	// TODO
	@Override
	protected Integer visitB2R(AST node) {
		return -1; // FIXME Return a proper value here.
	}

	@Override
	protected Integer visitB2S(AST node) {
		int x = newIntReg();
	    int y = visit(node.getChild(0));
	    emit(B2Ss, x, y);
	    return x;
	}

	// TODO
	@Override
	protected Integer visitI2R(AST node) {
		return -1; // FIXME Return a proper value here.
	}

	@Override
	protected Integer visitI2S(AST node) {
		int x = newIntReg();
	    int y = visit(node.getChild(0));
	    emit(I2Ss, x, y);
	    return x;
	}

	@Override
	protected Integer visitR2S(AST node) {
		int x = newIntReg();
	    int y = visit(node.getChild(0));
	    emit(R2Ss, x, y);
	    return x;
	}

}
