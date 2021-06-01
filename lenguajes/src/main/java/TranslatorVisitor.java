import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class TranslatorVisitor<T> extends MiLenguajeBaseVisitor<T> {
    FileWriter myWriter;
    String currentTypeInput;
    HashMap<String,String> variableTypeInput;

    public TranslatorVisitor(FileWriter myWriter) {
        this.myWriter = myWriter;
        this.currentTypeInput = "scanner.next()";
        this.variableTypeInput = new HashMap<>();
    }

    @Override
    public T visitProgram(MiLenguajeParser.ProgramContext ctx) {
        try {
            System.out.print("public class Main {\n");
            myWriter.write("public class Main {\n");
            System.out.print("static Scanner scanner = new Scanner(System.in);\n");
            myWriter.write("static Scanner scanner = new Scanner(System.in);\n");
            visitFuncandstruct(ctx.funcandstruct(0));
            visitMainfunction(ctx.mainfunction());
            visitFuncandstruct(ctx.funcandstruct(1));
            System.out.print("}\n");
            myWriter.write("}\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitFuncandstruct(MiLenguajeParser.FuncandstructContext ctx) {
        try {
            if (ctx.FUNCION() != null) {
                System.out.print("public static ");
                myWriter.write("public static ");
                visitType(ctx.type());
                System.out.print(" " + ctx.ID().getText() + "(");
                myWriter.write(" " + ctx.ID().getText() + "(");
                if (ctx.declarearguments() != null) {
                    visitDeclarearguments(ctx.declarearguments());
                }
                System.out.print("){\n");
                myWriter.write("){\n");
                if (ctx.funccontent() != null) {
                    visitFunccontent(ctx.funccontent());
                }
                System.out.print("\n}\n");
                myWriter.write("\n}\n");
                if (ctx.funcandstruct() != null) {
                    visitFuncandstruct(ctx.funcandstruct());
                }

            } else if (ctx.ESTRUCTURA() != null) {
                System.out.print("static class " + ctx.ID().getText() + "{\n");
                myWriter.write("static class " + ctx.ID().getText() + "{\n");
                if (ctx.structcontent() != null) {
                    visitStructcontent(ctx.structcontent());
                }
                System.out.print("\n}\n");
                myWriter.write("\n}\n");
                if (ctx.funcandstruct() != null) {
                    visitFuncandstruct(ctx.funcandstruct());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitDeclarearguments(MiLenguajeParser.DeclareargumentsContext ctx) {
        try {
            visitType(ctx.type());
            System.out.print(" " + ctx.ID().getText() + " ");
            myWriter.write(" " + ctx.ID().getText() + " ");
            visitDeclareargumentslist(ctx.declareargumentslist());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitDeclareargumentslist(MiLenguajeParser.DeclareargumentslistContext ctx) {
        try {
            if (ctx.TK_COMA() != null) {
                System.out.print(", ");
                myWriter.write(", ");
                visitType(ctx.type());
                System.out.print(" " + ctx.ID().getText() + " ");
                myWriter.write(" " + ctx.ID().getText() + " ");
                visitDeclareargumentslist(ctx.declareargumentslist());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitMainfunction(MiLenguajeParser.MainfunctionContext ctx) {
        try {
            System.out.print("public static void main(String[] args) {\n");
            myWriter.write("public static void main(String[] args) {\n");
            visitInstructionlist(ctx.instructionlist());
            System.out.print("\n}\n");
            myWriter.write("\n}\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitType(MiLenguajeParser.TypeContext ctx) {
        try {
            if (ctx.BOOLEANO() != null) {
                System.out.print("boolean");
                myWriter.write("boolean");
            }
            if (ctx.CARACTER() != null) {
                System.out.print("char");
                myWriter.write("char");
            }
            if (ctx.ENTERO() != null) {
                System.out.print("int");
                myWriter.write("int");
            }
            if (ctx.REAL() != null) {
                System.out.print("double");
                myWriter.write("double");
            }
            if (ctx.CADENA() != null) {
                System.out.print("String");
                myWriter.write("String");
            }
            if (ctx.ID() != null) {
                System.out.print(ctx.ID().getText());
                myWriter.write(ctx.ID().getText());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitStandardtype(MiLenguajeParser.StandardtypeContext ctx) {
        try {
            if (ctx.BOOLEANO() != null) {
                System.out.print("boolean");
                myWriter.write("boolean");
                currentTypeInput = "scanner.nextBoolean()";
            }
            if (ctx.CARACTER() != null) {
                System.out.print("char");
                myWriter.write("char");
                currentTypeInput = "scanner.next().charAt(0)";
            }
            if (ctx.ENTERO() != null) {
                System.out.print("int");
                myWriter.write("int");
                currentTypeInput = "scanner.nextInt()";
            }
            if (ctx.REAL() != null) {
                System.out.print("double");
                myWriter.write("double");
                currentTypeInput = "scanner.nextDouble()";
            }
            if (ctx.CADENA() != null) {
                System.out.print("String");
                myWriter.write("String");
                currentTypeInput = "scanner.next()";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitFunccontent(MiLenguajeParser.FunccontentContext ctx) {
        try {
            visitFninstructionlist(ctx.fninstructionlist());
            System.out.print("return ");
            myWriter.write("return ");
            visitExpression(ctx.expression());
            //pyc
            System.out.print(";\n");
            myWriter.write(";\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitStructcontent(MiLenguajeParser.StructcontentContext ctx) {
        try {
            if (ctx.standardtype() != null) {
                visitStandardtype(ctx.standardtype());
                System.out.print(" " + ctx.ID(0).getText() + " ");
                myWriter.write(" " + ctx.ID(0).getText() + " ");
                if (ctx.declarationlist() != null) {
                    visitDeclarationlist(ctx.declarationlist());

                } else {
                    System.out.print("=");
                    myWriter.write("=");
                    visitExpression(ctx.expression());
                    visitDeclarationlist(ctx.declarationlist());
                }
                System.out.print(";\n");
                myWriter.write(";\n");
                if (ctx.structcontent() != null) {
                    visitStructcontent(ctx.structcontent());
                }

            } else if (ctx.ID(0) != null) {

                System.out.print(ctx.ID(0).getText() + " ");
                myWriter.write(ctx.ID(0).getText() + " ");
                System.out.print(ctx.ID(1).getText() + " ");
                myWriter.write(ctx.ID(1).getText() + " ");
                if (ctx.declarationlist() != null) {
                    visitDeclarationlist(ctx.declarationlist());

                } else {
                    System.out.print("=");
                    myWriter.write("=");
                    visitExpression(ctx.expression());
                    visitDeclarationlist(ctx.declarationlist());
                }
                System.out.print(";\n");
                myWriter.write(";\n");
                if (ctx.structcontent() != null) {
                    visitStructcontent(ctx.structcontent());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitExpression(MiLenguajeParser.ExpressionContext ctx) {
        try {
            if (ctx.expression() != null) {
                visitExpression(ctx.expression());
                //espacio
                System.out.print(" ");
                myWriter.write(" ");
                visitBinaryoperator(ctx.binaryoperator());
                System.out.print(" ");
                myWriter.write(" ");
                visitTerm(ctx.term());
            } else {
                visitTerm(ctx.term());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitTerm(MiLenguajeParser.TermContext ctx) {

        if (ctx.unaryoperator() != null) {
            visitUnaryoperator(ctx.unaryoperator());
            visitValue(ctx.value());
        } else {
            visitValue(ctx.value());
        }

        return null;
    }

    @Override
    public T visitValue(MiLenguajeParser.ValueContext ctx) {
        try {
            if (ctx.TK_PAR_IZQ() != null&&ctx.ID()==null) {
                System.out.print("(");
                myWriter.write("(");
                visitExpression(ctx.expression());
                System.out.print(")");
                myWriter.write(")");
            } else if (ctx.structurelist() != null) {
                System.out.print(ctx.ID().getText());
                myWriter.write(ctx.ID().getText());
                visitStructurelist(ctx.structurelist());
            } else if (ctx.TK_ENTERO() != null) {
                System.out.print(ctx.TK_ENTERO().getText());
                myWriter.write(ctx.TK_ENTERO().getText());
            } else if (ctx.TK_REAL() != null) {
                System.out.print(ctx.TK_REAL().getText());
                myWriter.write(ctx.TK_REAL().getText());
            } else if (ctx.TK_CADENA() != null) {
                System.out.print(ctx.TK_CADENA().getText());
                myWriter.write(ctx.TK_CADENA().getText());
            } else if (ctx.TK_CARACTER() != null) {
                System.out.print(ctx.TK_CARACTER().getText());
                myWriter.write(ctx.TK_CARACTER().getText());
            } else if (ctx.FALSO() != null) {
                System.out.print("false");
                myWriter.write("false");
            } else if (ctx.VERDADERO() != null) {
                System.out.print("true");
                myWriter.write("true");
            } else if (ctx.expression() != null) {
                System.out.print(ctx.ID().getText());
                myWriter.write(ctx.ID().getText());
                System.out.print("(");
                myWriter.write("(");
                visitExpression(ctx.expression());
                visitArgumentlist(ctx.argumentlist());
                System.out.print(")");
                myWriter.write(")");
            } else {
                System.out.print(ctx.ID().getText());
                myWriter.write(ctx.ID().getText());
                System.out.print("(");
                myWriter.write("(");
                System.out.print(")");
                myWriter.write(")");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitArgumentlist(MiLenguajeParser.ArgumentlistContext ctx) {
        try {
            if (ctx.TK_COMA() != null) {
                System.out.print(",");
                myWriter.write(",");
                visitExpression(ctx.expression());
                visitArgumentlist(ctx.argumentlist());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitBinaryoperator(MiLenguajeParser.BinaryoperatorContext ctx) {
        try {
            if (ctx.TK_MAS() != null) {
                System.out.print("+");
                myWriter.write("+");
            } else if (ctx.TK_MENOS() != null) {
                System.out.print("-");
                myWriter.write("-");
            } else if (ctx.TK_MULT() != null) {
                System.out.print("*");
                myWriter.write("*");
            } else if (ctx.TK_DIV() != null) {
                System.out.print("/");
                myWriter.write("/");
            } else if (ctx.TK_MOD() != null) {
                System.out.print("%");
                myWriter.write("%");
            } else if (ctx.TK_ASIG() != null) {
                System.out.print("=");
                myWriter.write("=");
            } else if (ctx.TK_MENOR() != null) {
                System.out.print("<");
                myWriter.write("<");
            } else if (ctx.TK_MAYOR() != null) {
                System.out.print(">");
                myWriter.write(">");
            } else if (ctx.TK_MENOR_IGUAL() != null) {
                System.out.print("<=");
                myWriter.write("<=");
            } else if (ctx.TK_MAYOR_IGUAL() != null) {
                System.out.print(">=");
                myWriter.write(">=");
            } else if (ctx.TK_IGUAL() != null) {
                System.out.print("==");
                myWriter.write("==");
            } else if (ctx.TK_Y() != null) {
                System.out.print("&&");
                myWriter.write("&&");
            } else if (ctx.TK_O() != null) {
                System.out.print("||");
                myWriter.write("||");
            } else if (ctx.TK_DIF() != null) {
                System.out.print("!=");
                myWriter.write("!=");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitUnaryoperator(MiLenguajeParser.UnaryoperatorContext ctx) {
        try {
            if (ctx.TK_NEG() != null) {
                System.out.print("!");
                myWriter.write("!");
            } else if (ctx.TK_MENOS() != null) {
                System.out.print("-");
                myWriter.write("-");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitDeclarationlist(MiLenguajeParser.DeclarationlistContext ctx) {
        try {
            if (ctx.expression() != null) {
                System.out.print(",");
                myWriter.write(",");
                System.out.print(" " + ctx.ID().getText() + "=");
                myWriter.write(" " + ctx.ID().getText() + "=");
                variableTypeInput.put(ctx.ID().getText(),currentTypeInput);
                visitExpression(ctx.expression());
                visitDeclarationlist(ctx.declarationlist());
            } else if (ctx.TK_COMA() != null) {
                System.out.print(",");
                myWriter.write(",");
                System.out.print(" " + ctx.ID().getText() + " ");
                myWriter.write(" " + ctx.ID().getText() + " ");
                variableTypeInput.put(ctx.ID().getText(),currentTypeInput);
                visitDeclarationlist(ctx.declarationlist());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitInstructionlist(MiLenguajeParser.InstructionlistContext ctx) {

        if (ctx.instruction() != null) {
            visitInstruction(ctx.instruction());
            visitInstructionlist(ctx.instructionlist());
        }

        return null;
    }

    @Override
    public T visitInstruction(MiLenguajeParser.InstructionContext ctx) {
        try {
            if (ctx.standardtype() != null && ctx.expression() != null) {
                visitStandardtype(ctx.standardtype());
                System.out.print(" " + ctx.ID(0).getText() + "=");
                myWriter.write(" " + ctx.ID(0).getText() + "=");
                variableTypeInput.put(ctx.ID(0).getText(),currentTypeInput);
                visitExpression(ctx.expression());
                visitDeclarationlist(ctx.declarationlist());
                System.out.print(";\n");
                myWriter.write(";\n");
            } else if (ctx.standardtype() != null) {
                visitStandardtype(ctx.standardtype());
                System.out.print(" " + ctx.ID(0).getText() + " ");
                myWriter.write(" " + ctx.ID(0).getText() + " ");
                variableTypeInput.put(ctx.ID(0).getText(),currentTypeInput);
                visitDeclarationlist(ctx.declarationlist());
                System.out.print(";\n");
                myWriter.write(";\n");
            } else if (ctx.declarationlist() != null && ctx.expression() != null) {

                System.out.print(ctx.ID(0).getText() + " ");
                myWriter.write(ctx.ID(0).getText() + " ");
                System.out.print(" " + ctx.ID(1).getText() + "=");
                myWriter.write(" " + ctx.ID(1).getText() + "=");
                visitExpression(ctx.expression());
                visitDeclarationlist(ctx.declarationlist());
                System.out.print(";\n");
                myWriter.write(";\n");
            } else if (ctx.declarationlist() != null) {

                System.out.print(ctx.ID(0).getText() + " ");
                myWriter.write(ctx.ID(0).getText() + " ");
                System.out.print(" " + ctx.ID(1).getText() + "");
                myWriter.write(" " + ctx.ID(1).getText() + "");
                visitDeclarationlist(ctx.declarationlist());
                System.out.print(";\n");
                myWriter.write(";\n");
            } else if (ctx.structurelist() != null && ctx.expression() != null) {

                System.out.print(ctx.ID(0).getText() + " ");
                myWriter.write(ctx.ID(0).getText() + " ");
                visitStructurelist(ctx.structurelist());
                System.out.print("=");
                myWriter.write("=");
                visitExpression(ctx.expression());
                System.out.print(";\n");
                myWriter.write(";\n");
            } else if (ctx.argumentlist() != null) {

                System.out.print(ctx.ID(0).getText() + "(");
                myWriter.write(ctx.ID(0).getText() + "(");
                visitExpression(ctx.expression());
                visitArgumentlist(ctx.argumentlist());
                System.out.print(");\n");
                myWriter.write(");\n");
            } else if (ctx.expression() != null && ctx.TK_ASIG()!=null) {

                System.out.print(ctx.ID(0).getText() + "=");
                myWriter.write(ctx.ID(0).getText() + "=");
                visitExpression(ctx.expression());
                System.out.print(";\n");
                myWriter.write(";\n");
            } else if (ctx.structurelist() != null) {
                System.out.print(ctx.ID(0).getText() + " ");
                myWriter.write(ctx.ID(0).getText() + " ");
                visitStructurelist(ctx.structurelist());
                System.out.print("=");
                myWriter.write("=");
                System.out.print("scanner.next()");
                myWriter.write("scanner.next()");

                //parser
                System.out.print(";\n");
                myWriter.write(";\n");
            } else if (ctx.LEER() != null) {

                System.out.print(ctx.ID(0).getText() + " ");
                myWriter.write(ctx.ID(0).getText() + " ");
                System.out.print("=");
                myWriter.write("=");

                if(variableTypeInput.containsKey(ctx.ID(0).getText())){

                    System.out.print(variableTypeInput.get(ctx.ID(0).getText()));
                    myWriter.write(variableTypeInput.get(ctx.ID(0).getText()));
                }else{
                    System.out.print("scanner.next()");
                    myWriter.write("scanner.next()");
                }
                //parser
                System.out.print(";\n");
                myWriter.write(";\n");
            } else if (ctx.conditional() != null) {
                visitConditional(ctx.conditional());
            } else if (ctx.whilePSI() != null) {
                visitWhilePSI(ctx.whilePSI());
            } else if (ctx.forPSI() != null) {
                visitForPSI(ctx.forPSI());
            } else if (ctx.dowhile() != null) {
                visitDowhile(ctx.dowhile());
            } else if (ctx.switchPSI() != null) {
                visitSwitchPSI(ctx.switchPSI());
            } else if(ctx.IMPRIMIR()!=null){

                System.out.print("System.out.println(");
                myWriter.write("System.out.println(");
                visitExpression(ctx.expression());
                visitExpressionlist(ctx.expressionlist());
                System.out.print(");\n");
                myWriter.write(");\n");
            }else{

                System.out.print(ctx.ID(0).getText() + "();\n");
                myWriter.write(ctx.ID(0).getText() + "();\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitConditional(MiLenguajeParser.ConditionalContext ctx) {
        try {
            if (ctx.SI_NO() != null) {
                System.out.print("if(");
                myWriter.write("if(");
                visitExpression(ctx.expression());
                System.out.print("){\n");
                myWriter.write("){\n");
                visitIfinstructionlist(ctx.ifinstructionlist(0));
                System.out.print("\n} else {\n");
                myWriter.write("\n}else{\n");
                visitIfinstructionlist(ctx.ifinstructionlist(1));
                System.out.print("\n}\n");
                myWriter.write("\n}\n");
            } else {
                System.out.print("if(");
                myWriter.write("if(");
                visitExpression(ctx.expression());
                System.out.print("){\n");
                myWriter.write("){\n");
                visitIfinstructionlist(ctx.ifinstructionlist(0));
                System.out.print("\n}\n");
                myWriter.write("\n}\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitWhilePSI(MiLenguajeParser.WhilePSIContext ctx) {
        try {

            System.out.print("while(");
            myWriter.write("while(");
            visitExpression(ctx.expression());
            System.out.print("){\n");
            myWriter.write("){\n");
            visitWhinstructionlist(ctx.whinstructionlist());
            System.out.print("\n}\n");
            myWriter.write("\n}\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitForPSI(MiLenguajeParser.ForPSIContext ctx) {
        try {
            if (ctx.standardtype() != null) {
                System.out.print("for(");
                myWriter.write("for(");
                visitStandardtype(ctx.standardtype());
                System.out.print(" " + ctx.ID().getText() + "=");
                myWriter.write(" " + ctx.ID().getText() + "=");
                visitExpression(ctx.expression(0));
                visitDeclarationlist(ctx.declarationlist());
                System.out.print(";");
                myWriter.write(";");
                visitExpression(ctx.expression(1));
                System.out.print(";");
                myWriter.write(";");
                visitExpression(ctx.expression(2));
                System.out.print("){\n");
                myWriter.write("){\n");
                visitFrinstructionlist(ctx.frinstructionlist());
                System.out.print("\n}\n");
                myWriter.write("\n}\n");
            } else if(ctx.ID()==null){
                System.out.print("for(");
                myWriter.write("for(");
                visitExpression(ctx.expression(0));
                System.out.print(";");
                myWriter.write(";");
                visitExpression(ctx.expression(1));
                System.out.print(";");
                myWriter.write(";");
                visitExpression(ctx.expression(2));
                System.out.print("){\n");
                myWriter.write("){\n");
                visitFrinstructionlist(ctx.frinstructionlist());
                System.out.print("\n}\n");
                myWriter.write("\n}\n");
            } else {
                System.out.print("for(");
                myWriter.write("for(");
                System.out.print(" " + ctx.ID().getText() + "=");
                myWriter.write(" " + ctx.ID().getText() + "=");
                visitExpression(ctx.expression(0));
                visitDeclarationlist(ctx.declarationlist());
                System.out.print(";");
                myWriter.write(";");
                visitExpression(ctx.expression(1));
                System.out.print(";");
                myWriter.write(";");
                System.out.print(" " + ctx.ID().getText() + "+=");
                myWriter.write(" " + ctx.ID().getText() + "+=");
                visitExpression(ctx.expression(2));
                System.out.print("){\n");
                myWriter.write("){\n");
                visitFrinstructionlist(ctx.frinstructionlist());
                System.out.print("\n}\n");
                myWriter.write("\n}\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitDowhile(MiLenguajeParser.DowhileContext ctx) {
        try {

            System.out.print("do{\n");
            myWriter.write("do{\n");
            visitDwinstructionlist(ctx.dwinstructionlist());
            System.out.print("\n} while (");
            myWriter.write("\n} while (");
            visitExpression(ctx.expression());
            System.out.print(");\n");
            myWriter.write(");\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitSwitchPSI(MiLenguajeParser.SwitchPSIContext ctx) {
        try {

            System.out.print("switch(");
            myWriter.write("switch(");
            System.out.print(ctx.ID().getText() + "){\n");
            myWriter.write(ctx.ID().getText() + "){\n");
            visitCaselist(ctx.caselist());
            System.out.print("\n}\n");
            myWriter.write("\n}\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitCaselist(MiLenguajeParser.CaselistContext ctx) {
        try {
            if (ctx.CASO() != null&&ctx.ROMPER()!=null) {
                System.out.print("case ");
                myWriter.write("case ");
                visitExpression(ctx.expression());
                System.out.print(":\n ");
                myWriter.write(":\n ");
                visitSwinstructionlist(ctx.swinstructionlist());
                System.out.print("break;\n");
                myWriter.write("break;\n");
                visitCaselist(ctx.caselist());
            }else if(ctx.CASO() != null){
                System.out.print("case ");
                myWriter.write("case ");
                visitExpression(ctx.expression());
                System.out.print(":\n ");
                myWriter.write(":\n ");
                visitSwinstructionlist(ctx.swinstructionlist());
                visitCaselist(ctx.caselist());
            }else if(ctx.DEFECTO()!=null &&ctx.ROMPER()!=null){
                System.out.print("default ");
                myWriter.write("default ");
                System.out.print(":\n ");
                myWriter.write(":\n ");
                visitSwinstructionlist(ctx.swinstructionlist());
                System.out.print("break;\n");
                myWriter.write("break;\n");
            }else if(ctx.DEFECTO()!=null){
                System.out.print("default ");
                myWriter.write("default ");
                System.out.print(":\n ");
                myWriter.write(":\n ");
                visitSwinstructionlist(ctx.swinstructionlist());
                visitCaselist(ctx.caselist());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitExpressionlist(MiLenguajeParser.ExpressionlistContext ctx) {
        try {
            if (ctx.expression() != null) {
                System.out.print("+\"\"+");
                myWriter.write("+\"\"+");
                visitExpression(ctx.expression());
                visitExpressionlist(ctx.expressionlist());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public T visitStructurelist(MiLenguajeParser.StructurelistContext ctx) {
        try {
            if (ctx.ID() != null) {
                System.out.print("+\"\"+");
                myWriter.write("+\"\"+");
                System.out.print(ctx.ID().getText());
                myWriter.write(ctx.ID().getText());
                visitStructurelist(ctx.structurelist());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitStinstructionlist(MiLenguajeParser.StinstructionlistContext ctx) {
        if(ctx.instruction()!=null){
            visitInstruction(ctx.instruction());
            visitStinstructionlist(ctx.stinstructionlist());
        }
        return null;
    }

    @Override
    public T visitFninstructionlist(MiLenguajeParser.FninstructionlistContext ctx) {
        if(ctx.instruction()!=null){
            visitInstruction(ctx.instruction());
            visitFninstructionlist(ctx.fninstructionlist());
        }
        return null;
    }

    @Override
    public T visitIfinstructionlist(MiLenguajeParser.IfinstructionlistContext ctx) {
        if(ctx.instruction()!=null){
            visitInstruction(ctx.instruction());
            visitIfinstructionlist(ctx.ifinstructionlist());
        }
        return null;
    }

    @Override
    public T visitWhinstructionlist(MiLenguajeParser.WhinstructionlistContext ctx) {
        if(ctx.instruction()!=null){
            visitInstruction(ctx.instruction());
            visitWhinstructionlist(ctx.whinstructionlist());
        }
        return null;
    }

    @Override
    public T visitFrinstructionlist(MiLenguajeParser.FrinstructionlistContext ctx) {
        if(ctx.instruction()!=null){
            visitInstruction(ctx.instruction());
            visitFrinstructionlist(ctx.frinstructionlist());
        }
        return null;
    }

    @Override
    public T visitDwinstructionlist(MiLenguajeParser.DwinstructionlistContext ctx) {
        try {
            if (ctx.instruction() != null) {
                visitInstruction(ctx.instruction());
                visitDwinstructionlist(ctx.dwinstructionlist());
            }else if(ctx.ROMPER()!=null){
                System.out.print("break;\n");
                myWriter.write("break;\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitSwinstructionlist(MiLenguajeParser.SwinstructionlistContext ctx) {
        if(ctx.instruction()!=null){
            visitInstruction(ctx.instruction());
            visitSwinstructionlist(ctx.swinstructionlist());
        }
        return null;
    }

}
