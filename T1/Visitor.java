import javax.print.DocFlavor.STRING;

import tables.FuncTable;
import tables.VarTable;
import tables.StrTable;

import org.antlr.v4.runtime.Token;

import typing.Type;

public class Visitor extends golangramBaseVisitor<Type> {

    FuncTable funcTable = new FuncTable();
    StrTable strTable = new StrTable();
    VarTable varTable;
    String funcName;
    Type type;
    int parametersCount = 0;
    int argumentsCount = 0;

    // Testa se o dado token foi declarado antes.
    private Type checkVar(Token token) {
        String text = token.getText();
        int line = token.getLine();
           int idx = varTable.lookupVar(text);
        if (idx == -1) {
            System.err.printf("SEMANTIC ERROR (%d): variable '%s' was not declared.\n", line, text);
            System.exit(1);
            return null; // Never reached.
        }
        return varTable.getType(idx);
    }

    @Override public Type visitFunctionDecl(golangramParser.FunctionDeclContext ctx) {
        funcName = ctx.ID().getText();
        varTable = new VarTable();

        visit(ctx.parameters());
        visit(ctx.block());
        
        int isNewFunc = funcTable.containsFunction(ctx.ID().getText());
        if (isNewFunc == -1) {
            if (ctx.type_() != null) {
                Type t2 = null;

                String t = ctx.type_().ID().getText();

                if(t.equals("string")) {
                    t2 = Type.STR_TYPE;
                } else if (t.equals("int")){
                    t2 = Type.INT_TYPE;
                } else if (t.equals("float32")){
                    t2 = Type.REAL_TYPE;
                } else if (t.equals("bool")){
                    t2 = Type.BOOL_TYPE;
                } 

                funcTable.addFunction(ctx.ID().getText(), varTable, t2, parametersCount);
            } else {
                funcTable.addFunction(ctx.ID().getText(), varTable, null, parametersCount);
            }

        } else {
            System.out.println("Nao eh possivel declarar duas funcoes com o mesmo nome. Declarando: " + ctx.ID().getText());
            System.exit(1);
        }

        return null; 
    }

    @Override public Type visitParameters(golangramParser.ParametersContext ctx) {
        parametersCount = ctx.parameterDecl().size();

        return null;    
     }
	

    @Override public Type visitSimpleDeclareAssignment(golangramParser.SimpleDeclareAssignmentContext ctx) { 
        int isNewVar = varTable.lookupVar(ctx.toString());
        
        if (isNewVar == -1) {
            varTable.addVar(ctx.declareAssignment().ID().getText(), ctx.getStart().getLine(), Type.INT_TYPE);
        } else {
            System.out.println("Nao eh possivel declarar duas variaveis com o mesmo nome. Declarando: " + ctx.declareAssignment().ID().getText());
            System.exit(1);
        }
        return null;
    }

    @Override public Type visitVarSpec(golangramParser.VarSpecContext ctx) { 
        Type typeExp = null;
        
        if (ctx.expressionList() != null){
            typeExp = visit(ctx.expressionList());
        }
        
        String t;

        if(ctx.type_() != null){
            visit(ctx.type_());
            t = ctx.type_().ID().getText();

            if(t.equals("string")) {
                type = Type.STR_TYPE;
            } else if (t.equals("int")){
                type = Type.INT_TYPE;
            } else if (t.equals("float32")){
                type = Type.REAL_TYPE;
            } else if (t.equals("bool")){
                type = Type.BOOL_TYPE;
            } 

            if (typeExp != null){
                if (type.equals(typeExp)){
                    typeExp = type;
                    System.out.println(typeExp);
                } else if (typeExp.equals(Type.INT_TYPE) && type.equals(Type.REAL_TYPE)) {
                    typeExp = Type.REAL_TYPE;
                    System.out.println(typeExp);
                } else {
                    System.out.println("null var spec");
                    return null;
                }
            } else {
                typeExp = type;
            }
        } else if (ctx.arrayType() != null) {
            String s = ctx.arrayType().type_().getText();

            if(s.equals("string")) {
                typeExp = Type.STR_TYPE;
            } else if (s.equals("int")){
                typeExp = Type.INT_TYPE;
            } else if (s.equals("float32")){
                typeExp = Type.REAL_TYPE;
            } else if (s.equals("bool")){
                typeExp = Type.BOOL_TYPE;
            } 
      
        }

        int isNewVar = varTable.lookupVar(ctx.idList().ID(0).getText());
        if (isNewVar == -1) {
            varTable.addVar(ctx.idList().ID(0).getText(), ctx.getStart().getLine(), typeExp);
            System.out.println(typeExp);
            return typeExp;
        } else {
            System.out.println("Nao eh possivel declarar duas variaveis com o mesmo nome. Declarando: " + ctx.idList().ID(0).getText());
            System.exit(1);
        }

        System.out.println("Tipo de variavel errado em var spec");
        System.exit(1);
        return null;          
    }

    @Override public Type visitSimpleArrayStmt(golangramParser.SimpleArrayStmtContext ctx) { 

        Type arrayType = visit(ctx.arrayStmt().operand());

        Type stmtType = visit(ctx.arrayStmt().basicLit());


        if (arrayType.equals(stmtType)) {
            System.out.println(type);
            return type;
        }
        
        System.out.println("Tipo de variavel errado na declaração do vetor");
        System.exit(1);
        return null;
    }
	

    @Override public Type visitParameterDecl(golangramParser.ParameterDeclContext ctx) { 

        int isNewVar = varTable.lookupVar(ctx.ID().getText());
        if (isNewVar == -1) {
            varTable.addVar(ctx.ID().getText(), ctx.getStart().getLine(), type);
        } else {
            System.out.println("Nao eh possivel declarar duas variaveis com o mesmo nome. Declarando: " + ctx.ID().getText());
            System.exit(1);
        }
        return null;
    }
	
    @Override public Type visitStrVal(golangramParser.StrValContext ctx) { 
        strTable.add(ctx.STR_VAL().getText());
        type = Type.STR_TYPE;
        return Type.STR_TYPE; 
    }

    @Override public Type visitIntVal(golangramParser.IntValContext ctx) { 
        type = Type.INT_TYPE;
        return Type.INT_TYPE;
    }


	@Override public Type visitRealVal(golangramParser.RealValContext ctx) { 
        type = Type.REAL_TYPE;
        return Type.REAL_TYPE;
    }

    @Override public Type visitBoolVal(golangramParser.BoolValContext ctx) { 
        type = Type.BOOL_TYPE;
        return Type.BOOL_TYPE;
    }
	

	@Override public Type visitAdd_opExpression(golangramParser.Add_opExpressionContext ctx) { 
        Type esq = visit(ctx.expression(0));
        Type dir = visit(ctx.expression(1));

        if (ctx.PLUS() != null) {
            if (esq.equals(dir) && !esq.equals(Type.BOOL_TYPE)){
                System.out.println(dir);
                return dir;
            } else if (esq.equals(Type.INT_TYPE) && dir.equals(Type.REAL_TYPE)){
                System.out.println(Type.REAL_TYPE);
                return Type.REAL_TYPE;
            } else if (esq.equals(Type.REAL_TYPE) && dir.equals(Type.INT_TYPE)){
                System.out.println(Type.REAL_TYPE);
                return Type.REAL_TYPE;
            }
        } else if (ctx.MINUS() != null) {
            if (esq.equals(dir) && !esq.equals(Type.BOOL_TYPE) && !esq.equals(Type.STR_TYPE)){
                System.out.println(dir);
                return dir;
            } else if (esq.equals(Type.INT_TYPE) && dir.equals(Type.REAL_TYPE)){
                System.out.println(Type.REAL_TYPE);
                return Type.REAL_TYPE;
            } else if (esq.equals(Type.REAL_TYPE) && dir.equals(Type.INT_TYPE)){
                System.out.println(Type.REAL_TYPE);
                return Type.REAL_TYPE;
            }
        }
        System.out.println("Tipo de variavel errado em add op");
        System.exit(1);
        return null;
    }
	
    @Override public Type visitMul_opExpression(golangramParser.Mul_opExpressionContext ctx) { 
        Type esq = visit(ctx.expression(0));
        Type dir = visit(ctx.expression(1));

        if (ctx.TIMES() != null || ctx.OVER() != null) {
            if (esq.equals(dir) && !esq.equals(Type.BOOL_TYPE) && !esq.equals(Type.STR_TYPE)){
                System.out.println(dir);
                return dir;
            } else if (esq.equals(Type.INT_TYPE) && dir.equals(Type.REAL_TYPE)){
                System.out.println(Type.REAL_TYPE);
                return Type.REAL_TYPE;
            } else if (esq.equals(Type.REAL_TYPE) && dir.equals(Type.INT_TYPE)){
                System.out.println(Type.REAL_TYPE);
                return Type.REAL_TYPE;
            }
        } else if (ctx.MOD() != null) {
            if (esq.equals(Type.INT_TYPE) && dir.equals(Type.INT_TYPE)){
                System.out.println(Type.INT_TYPE);
                return Type.INT_TYPE;
            }
        }

        System.out.println("Tipo de variavel errado em mult op");
        System.exit(1);
        return null;
    }

    @Override public Type visitRel_opExpression(golangramParser.Rel_opExpressionContext ctx) { 
        Type esq = visit(ctx.expression(0));
        Type dir = visit(ctx.expression(1));

        if (esq.equals(Type.INT_TYPE) && dir.equals(Type.INT_TYPE)){
            System.out.println(Type.BOOL_TYPE);
            return Type.BOOL_TYPE;
        } else if (esq.equals(Type.REAL_TYPE) && dir.equals(Type.REAL_TYPE)){
            System.out.println(Type.BOOL_TYPE);
            return Type.BOOL_TYPE;
        } else if (esq.equals(Type.INT_TYPE) && dir.equals(Type.REAL_TYPE)){
            System.out.println(Type.BOOL_TYPE);
            return Type.BOOL_TYPE;
        } else if (esq.equals(Type.REAL_TYPE) && dir.equals(Type.INT_TYPE)){
            System.out.println(Type.BOOL_TYPE);
            return Type.BOOL_TYPE;
        } else if (esq.equals(Type.STR_TYPE) && dir.equals(Type.STR_TYPE)){
            System.out.println(Type.BOOL_TYPE);
            return Type.BOOL_TYPE;
        } else if (esq.equals(Type.BOOL_TYPE) && dir.equals(Type.BOOL_TYPE)) {
            if (ctx.ISEQUAL() != null || ctx.NOTEQUAL() != null) {
                System.out.println(Type.BOOL_TYPE);
                return Type.BOOL_TYPE;
            }
        }

        System.out.println("Tipo de variavel errado em rel op");
        System.exit(1);
        return null;
    }
	
	@Override public Type visitIncDecStmt(golangramParser.IncDecStmtContext ctx) {
        Type exp = visit(ctx.expression());

        if (exp.equals(Type.INT_TYPE) || exp.equals(Type.REAL_TYPE)) {
            System.out.println(exp);
            return exp;
        }

        System.out.println("Tipo de variavel errado em inc dec");
        System.exit(1);
        return null;
    }

    @Override public Type visitUnary_opExpression(golangramParser.Unary_opExpressionContext ctx) { 
        Type exp = visit(ctx.expression());

        if (ctx.NOT() != null) {
            if(exp.equals(Type.BOOL_TYPE)){
                System.out.printf("ta em unary: %s\n",Type.BOOL_TYPE);
                return Type.BOOL_TYPE;
            }
        }

        System.out.println("Tipo de variavel errado em unary op");
        System.exit(1);
        return null;
    }

    @Override public Type visitOperandID(golangramParser.OperandIDContext ctx) { 
        checkVar(ctx.ID().getSymbol());
		int id = varTable.lookupVar(ctx.ID().getText());

		Type idType = varTable.getType(id);

        return idType;

    }

    @Override public Type visitExpressionList(golangramParser.ExpressionListContext ctx) {
        argumentsCount = ctx.expression().size();
        
        return visitChildren(ctx);
    }
	
	@Override public Type visitFuncCall(golangramParser.FuncCallContext ctx) { 
        funcName = ctx.ID().getText();

        argumentsCount = 0;
        visit(ctx.arguments());
        
        int isDeclaredFunc = funcTable.containsFunction(ctx.ID().getText());
        if (isDeclaredFunc != -1) {
            int parameters = funcTable.getQtdParams(isDeclaredFunc);
            if (parameters == argumentsCount) {
                System.out.println("quantidade certa de parametros");
                Type typeReturn = funcTable.getReturn(isDeclaredFunc);
                if(typeReturn != null) {
                    System.out.println(typeReturn);
                    return typeReturn;
                }
            } else {
                System.out.printf("A quantidade correta de parametros da função %s é %d, você digitou %d!",ctx.ID().getText(), parameters, argumentsCount);
                System.exit(1);
            }

        } else {
            System.out.println("Nao eh possivel chamar uma função não declarada. Erro em: " + ctx.ID().getText());
            System.exit(1);
        }

        return null;
    }
	
}