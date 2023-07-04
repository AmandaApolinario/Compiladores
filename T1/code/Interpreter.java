package code;

import static typing.Type.INT_TYPE;
import static typing.Type.REAL_TYPE;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

import ast.AST;
import ast.ASTBaseVisitor;
import tables.FuncTable;
import tables.StrTable;
import tables.VarTable;
import typing.Type;

/*
 * Interpretador de código para EZLang, implementado como
 * um visitador da AST gerada pelo front-end. Tipo genérico
 * foi instanciado para Void porque a gente não precisa de
 * um valor de retorno na visitação. Para o gerador de código
 * do próximo laboratório isso vai mudar.
 *
 * Para rodar, chame o método 'execute' da superclasse.
 */
public class Interpreter extends ASTBaseVisitor<Void> {

	// Tudo privado e final para simplificar.
	// private final DataStack stack;
	private final Memory memory;
	private final StrTable st;
	private final FuncTable ft;
	private final VarTable vt;
	private final Scanner in; // Para leitura de stdin

	FrameStack stackFrame;
	DataStack currentFrame;

	int currentFuncCall;
	boolean isOnMain = true;

	// Construtor basicão.
	public Interpreter(StrTable st, VarTable vt, FuncTable ft) {
		this.stackFrame = new FrameStack();
		this.currentFrame = new DataStack();
		stackFrame.push(currentFrame);
		this.memory = new Memory(vt);
		this.ft = ft;
		this.st = st;
		this.vt = vt;
		this.in = new Scanner(System.in);
	}

	// -------------------------------------------------------
	// Daqui para frente são os métodos especializados de cada
	// nó. O código deve ser mais ou menos auto-explicativo.
	// Estou assumindo que nessa altura de tudo você já está
	// ninja dos caminhamentos em árvores...

	// TODO
	@Override
	protected Void visitAssign(AST node) {
		visit(node.getChild(1));

		if (node.getChild(0).type.equals(Type.REAL_TYPE)) {
			float val = currentFrame.popf();
			int addr = node.getChild(0).intData;
			memory.storef(addr, val);
		} 
		else {
			int val = currentFrame.popi();
			int addr = node.getChild(0).intData;
			memory.storei(addr, val);
		}
		
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// TODO
	@Override
	protected Void visitEq(AST node) {
		visit(node.getChild(0));
		visit(node.getChild(1));

		Type type = node.getChild(0).type;

		switch (type) {
		case INT_TYPE:
			int leftInt = currentFrame.popi();
			int rightInt = currentFrame.popi();
		
			boolean resp = rightInt == leftInt;

			if (resp == true) {
				currentFrame.pushi(1);
			} else {
				currentFrame.pushi(0);
			}
			break;
		case REAL_TYPE:
			float leftReal = currentFrame.popf();
			float rightReal = currentFrame.popf();
			boolean respFloat = rightReal == leftReal;

			if (respFloat == true) {
				currentFrame.pushf(1);
			} else {
				currentFrame.pushf(0);
			}
			break;
		default:
			break;
		}
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// DONE
	@Override
	protected Void visitBlock(AST node) {
		for(int i=0; i < node.children.size(); i++) {
			visit(node.getChild(i));
		}
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// TODO
	@Override
	protected Void visitBoolVal(AST node) {
		currentFrame.pushi(node.intData);
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// TODO
	@Override
	protected Void visitIf(AST node) {
		visit(node.getChild(0));

		if (currentFrame.popi() == 1) {
			visit(node.getChild(1));
		} else {
			for (int i=2; i < node.children.size(); i++) {
				visit(node.getChild(i));
			}
		}

        return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// DONE
	@Override
	protected Void visitIntVal(AST node) {
		currentFrame.pushi(node.intData);
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// TODO
	@Override
	protected Void visitLt(AST node) {
		visit(node.getChild(0));
		visit(node.getChild(1));

		Type type = node.getChild(0).type;

		switch (type) {
		case INT_TYPE:
			int leftInt = currentFrame.popi();
			int rightInt = currentFrame.popi();
		
			boolean resp = rightInt < leftInt;
			if (resp == true) {
				currentFrame.pushi(1);
			} else {
				currentFrame.pushi(0);
			}
			break;
		case REAL_TYPE:
			float leftReal = currentFrame.popf();
			float rightReal = currentFrame.popf();
			boolean respFloat = rightReal < leftReal;

			if (respFloat == true) {
				currentFrame.pushf(1);
			} else {
				currentFrame.pushf(0);
			}
			break;
		default:
			break;
		}
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// TODO
	@Override
	protected Void visitMinus(AST node) {
		visit(node.getChild(0));
        
		visit(node.getChild(1));
		Type type = node.type;

		switch (type) {
		case INT_TYPE:

			int leftInt = currentFrame.popi();
			int rightInt = currentFrame.popi();
		
			int somaInt = rightInt - leftInt;

			currentFrame.pushi(somaInt);
			break;
		case REAL_TYPE:
			float leftReal = currentFrame.popf();
			float rightReal = currentFrame.popf();
			float somaReal = rightReal - leftReal;

			currentFrame.pushf(somaReal);
			break;
		case STR_TYPE:
			break;
		default:
			break;
		}
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// TODO
	@Override
	protected Void visitOver(AST node) {
		visit(node.getChild(0));
        
		visit(node.getChild(1));
		Type type = node.type;

		switch (type) {
		case INT_TYPE:
			int rightInt = currentFrame.popi();
			int leftInt = currentFrame.popi();

			int overInt =  leftInt / rightInt;
			currentFrame.pushi(overInt);
			break;
		case REAL_TYPE:
			float rightReal = currentFrame.popf();
			float leftReal = currentFrame.popf();
			float overReal = leftReal / rightReal;

			currentFrame.pushf(overReal);
			break;
		case STR_TYPE:
			break;
		default:
			break;
		}
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// TODO
	@Override
	protected Void visitPlus(AST node) {
		visit(node.getChild(0));
        
		visit(node.getChild(1));
		Type type = node.type;
		
		switch (type) {
		case INT_TYPE:
			int leftInt = currentFrame.popi();
			int rightInt = currentFrame.popi();

			int somaInt = leftInt + rightInt;

			currentFrame.pushi(somaInt);
			break;
		case REAL_TYPE:
			float leftReal = currentFrame.popf();
			float rightReal = currentFrame.popf();
			float somaReal = leftReal + rightReal;

			currentFrame.pushf(somaReal);
			break;
		case STR_TYPE:
			int pos = currentFrame.popi();
			int pos2 = currentFrame.popi();

			String s1 = st.get(pos2);
			String s2 = st.get(pos);	

			String s = s1.substring(0, s1.length() - 1) + s2.substring(1, s2.length());
			int strIdx = st.addStr(s);

			currentFrame.pushi(strIdx);

			break;
		default:
			break;
		}
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	@Override
	protected Void visitProgram(AST node) {
		for (int i =0;i < node.children.size(); i++) {
			if (ft.getName(i+2).equals("main")) {
				visit(node.getChild(i));
			} 
		
		}
		in.close(); // Fim do programa, não precisa mais de ler de stdin.
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// TODO
	@Override
	protected Void visitRead(AST node) {
		visit(node.getChild(1));
		Type type = node.getChild(1).type;
		int addr = node.getChild(1).intData;

		switch (type) {
			case STR_TYPE:
				readStr(addr);
				break;
			case INT_TYPE:
				readInt(addr);
				break;
			case REAL_TYPE:
				readReal(addr);
				break;
			case BOOL_TYPE:
				readBool(addr);
				break;
			default:
				break;
		}

		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// Funções auxiliares para implementar 'visitRead'.

	private Void readInt(int varIdx) {
		System.out.printf("read (int): ");
		int value = in.nextInt();
		memory.storei(varIdx, value);
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	private Void readReal(int varIdx) {
		System.out.printf("read (real): ");
		float value = in.nextFloat();
		memory.storef(varIdx, value);
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	private Void readBool(int varIdx) {
		int value;
	    do {
	        System.out.printf("read (bool - 0 = false, 1 = true): ");
	        value = in.nextInt();
	    } while (value != 0 && value != 1);
	    memory.storei(varIdx, value);
	    return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	private Void readStr(int varIdx) {
		System.out.printf("read (str): ");
		String s = in.next();
		int strIdx = st.addStr(s);
		memory.storei(varIdx, strIdx);
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// DONE
	@Override
	protected Void visitRealVal(AST node) {
		currentFrame.pushf(node.floatData);
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// TODO
	@Override
	protected Void visitRepeat(AST node) {
		visit(node.getChild(0));

		while (currentFrame.popi() != 0) {
			visit(node.getChild(1));
			visit(node.getChild(0));
		} 

	    return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	@Override
	protected Void visitStrVal(AST node) {
		currentFrame.pushi(node.intData);
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// TODO
	@Override
	protected Void visitTimes(AST node) {
		visit(node.getChild(0));
		visit(node.getChild(1));
		Type type = node.type;

		switch (type) {
		case INT_TYPE:
			int leftInt = currentFrame.popi();
			int rightInt = currentFrame.popi();
			int multInt = leftInt * rightInt;

			currentFrame.pushi(multInt);
			break;
		case REAL_TYPE:
			float leftReal = currentFrame.popf();
			float rightReal = currentFrame.popf();
			float multReal = leftReal * rightReal;

			currentFrame.pushf(multReal);
			break;
		case STR_TYPE:
			break;
		default:
			break;
		}
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	@Override
	protected Void visitVarDecl(AST node) {
		// Nothing to do.
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	@Override
	protected Void visitVarList(AST node) {
		// Nothing to do.
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	@Override
	protected Void visitFuncDecl(AST node) {
		visit(node.getChild(0));
		visit(node.getChild(1));
		return null;
	}

	@Override
	protected Void visitMt(AST node) {
		visit(node.getChild(0));
		visit(node.getChild(1));

		Type type = node.getChild(0).type;

		switch (type) {
		case INT_TYPE:
			int leftInt = currentFrame.popi();
			int rightInt = currentFrame.popi();
		
			boolean resp = rightInt > leftInt;

			if (resp == true) {
				currentFrame.pushi(1);
			} else {
				currentFrame.pushi(0);
			}
			break;
		case REAL_TYPE:
			float leftReal = currentFrame.popf();
			float rightReal = currentFrame.popf();
			boolean respFloat = rightReal > leftReal;

			if (respFloat == true) {
				currentFrame.pushf(1);
			} else {
				currentFrame.pushf(0);
			}
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	protected Void visitNotEq(AST node) {
		visit(node.getChild(0));
		visit(node.getChild(1));

		Type type = node.getChild(0).type;

		switch (type) {
		case INT_TYPE:
			int leftInt = currentFrame.popi();
			int rightInt = currentFrame.popi();
		
			boolean resp = rightInt != leftInt;

			if (resp == true) {
				currentFrame.pushi(1);
			} else {
				currentFrame.pushi(0);
			}
			break;
		case REAL_TYPE:
			float leftReal = currentFrame.popf();
			float rightReal = currentFrame.popf();
			boolean respFloat = rightReal != leftReal;

			if (respFloat == true) {
				currentFrame.pushf(1);
			} else {
				currentFrame.pushf(0);
			}
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	protected Void visitLEq(AST node) {
		visit(node.getChild(0));
		visit(node.getChild(1));

		Type type = node.getChild(0).type;

		switch (type) {
		case INT_TYPE:
			int leftInt = currentFrame.popi();
			int rightInt = currentFrame.popi();
		
			boolean resp = rightInt <= leftInt;

			if (resp == true) {
				currentFrame.pushi(1);
			} else {
				currentFrame.pushi(0);
			}
			break;
		case REAL_TYPE:
			float leftReal = currentFrame.popf();
			float rightReal = currentFrame.popf();
			boolean respFloat = rightReal <= leftReal;

			if (respFloat == true) {
				currentFrame.pushf(1);
			} else {
				currentFrame.pushf(0);
			}
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	protected Void visitMEqt(AST node) {
		visit(node.getChild(0));
		visit(node.getChild(1));

		Type type = node.getChild(0).type;

		switch (type) {
		case INT_TYPE:
			int leftInt = currentFrame.popi();
			int rightInt = currentFrame.popi();
		
			boolean resp = rightInt >= leftInt;

			if (resp == true) {
				currentFrame.pushi(1);
			} else {
				currentFrame.pushi(0);
			}
			break;
		case REAL_TYPE:
			float leftReal = currentFrame.popf();
			float rightReal = currentFrame.popf();
			boolean respFloat = rightReal >= leftReal;

			if (respFloat == true) {
				currentFrame.pushf(1);
			} else {
				currentFrame.pushf(0);
			}
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	protected Void visitParamList(AST node) {
		
		if (!stackFrame.isEmpty()) {
			// stackFrame.pop();
			// DataStack lastFunc = stackFrame.peek();
			// stackFrame.push(currentFrame);
			// for(int i =0; i < node.children.size(); i++) {
			// 	//EXISTEM FLOATS LEMBRESE DISSO AINDA HOJE
			// 	currentFrame.pushi(lastFunc.popi());
			// 	visit(node.getChild(i));
			// }
		}
		return null;
	}

	@Override
	protected Void visitFuncCall(AST node) {
		currentFuncCall = node.intData;
		visit(node.getChild(0));

		if (currentFuncCall > 1) {
			DataStack newframe = new DataStack();
			stackFrame.push(newframe);
			currentFrame = newframe;
			visit(ft.getAddr(currentFuncCall));
			stackFrame.pop();
			currentFrame = stackFrame.peek();
		}
		
		return null;
	}

	@Override
	protected Void visitWhile(AST node) {
		return null;
	}

	@Override
	protected Void visitArgs(AST node) {
		if (currentFuncCall == 0) {			
			visitRead(node);
		} else if (currentFuncCall == 1) {
			visitWrite(node);
		} else {
			for (int i=0; i<node.children.size(); i++) {
				visit(node.getChild(i));
			}
		}
		
		return null;
	}

	// TODO
	@Override
	protected Void visitVarUse(AST node) {
		Type type = node.type;
		int addr = node.intData;
		int varValue;

		switch (type) {
			case INT_TYPE:
				varValue = memory.loadi(addr);
				currentFrame.pushi(varValue);
				break;
			case REAL_TYPE:
				float floatValue = memory.loadf(addr);
				currentFrame.pushf(floatValue);
				break;
			case BOOL_TYPE:
				varValue = memory.loadi(addr);
				currentFrame.pushi(varValue);
				break;
			case STR_TYPE:
				varValue = memory.loadi(addr);
				currentFrame.pushi(varValue);
				break;
			default:
				break;
		}

		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// DONE
	@Override
	protected Void visitWrite(AST node) {
		visit(node.getChild(0));
		Type type = node.getChild(0).type;

		switch (type) {
			case STR_TYPE:
				writeStr();
				break;
			case INT_TYPE:
				writeInt();
				break;
			case REAL_TYPE:
				writeReal();
				break;
			case BOOL_TYPE:
				writeBool();
				break;
			default:
				break;
		}
		return null;
	}

	// Funções auxiliares para implementar 'visitWrite'.

	private Void writeInt() {
		System.out.println(currentFrame.popi());
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	private Void writeReal() {
		System.out.println(currentFrame.popf());
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	private Void writeBool() {
		if (currentFrame.popi() == 0) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	private Void writeStr() {
		int strIdx = currentFrame.popi(); // String pointer
		String originalStr = st.get(strIdx);
		String unescapedStr = unescapeStr(originalStr);
		System.out.println(unescapedStr);
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// Função auxiliar para converter a string com escapes.
	// Há várias formas de se fazer isso em Java mas preferi
	// deixar assim para não precisar de bibliotecas ou de uma
	// versão do Java mais recente.
	// Se você preferir, pode usar:
	// org.apache.commons.lang.StringEscapeUtils.unescapeJava()
	// ou
	// String.translateEscapes(), disponível a partir do Java 15.
	private String unescapeStr(String originalStr) {
		StreamTokenizer parser = new StreamTokenizer(new StringReader(originalStr));
		String unescapedStr = "";
		try {
		    parser.nextToken();
		    if (parser.ttype == '"') {
			    unescapedStr = parser.sval;
		    } else {
			  unescapedStr = "ERROR at string conversion!";
		    }
		}
		catch (IOException e) {
		    e.printStackTrace();
		}
		return unescapedStr;
	}

	// TODO
	@Override
	protected Void visitB2I(AST node) {
		visit(node.getChild(0));

		if (currentFrame.popi() == 0) {
			currentFrame.pushi(0);
		} else {
			currentFrame.pushi(1);
		}

		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// TODO
	@Override
	protected Void visitB2R(AST node) {
		visit(node.getChild(0));

		if (currentFrame.popf() == 0.0) {
			currentFrame.pushf(0);
		} else {
			currentFrame.pushf(1);
		}
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	@Override
	protected Void visitB2S(AST node) {
		visit(node.getChild(0));
		String s;
		if (currentFrame.popi() == 0) {
			s = '"' + Boolean.toString(false) + '"';
		} else {
			s = '"' + Boolean.toString(true) + '"';
		}
		currentFrame.pushi(st.addStr(s));
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	// TODO
	@Override
	protected Void visitI2R(AST node) {
		visit(node.getChild(0));

		currentFrame.pushf(currentFrame.popi());

		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	@Override
	protected Void visitI2S(AST node) {
		visit(node.getChild(0));
		String s = '"' + Integer.toString(currentFrame.popi()) + '"';
		currentFrame.pushi(st.addStr(s));
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

	@Override
	protected Void visitR2S(AST node) {
		visit(node.getChild(0));
		String s = '"' + Float.toString(currentFrame.popf()) + '"';
		currentFrame.pushi(st.addStr(s));
		return null; // Java exige um valor de retorno mesmo para Void... :/
	}

}
