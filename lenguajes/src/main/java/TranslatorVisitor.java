import java.io.FileWriter;
import java.io.IOException;

public class TranslatorVisitor<T> extends MiLenguajeBaseVisitor<T>{
    FileWriter myWriter;
    public TranslatorVisitor(FileWriter myWriter) {
        this.myWriter = myWriter;
    }

    @Override
    public T visitProgram(MiLenguajeParser.ProgramContext ctx) {
        try{
            System.out.print("public class Main {\n");
            myWriter.write("public class Main {\n");
            visitFuncandstruct(ctx.funcandstruct(0));
            visitMainfunction(ctx.mainfunction());
            visitFuncandstruct(ctx.funcandstruct(1));
            System.out.print("}\n");
            myWriter.write("}\n");
        }catch(IOException e){
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
                System.out.print(" "+ctx.ID().getText()+"(");
                myWriter.write(" "+ctx.ID().getText()+"(");
                if(ctx.declarearguments()!=null){
                    visitDeclarearguments(ctx.declarearguments());
                }
                System.out.print("){\n");
                myWriter.write("){\n");
                if(ctx.funccontent()!=null){
                    visitFunccontent(ctx.funccontent());
                }
                System.out.print("\n}\n");
                myWriter.write("\n}\n");
                if(ctx.funcandstruct()!=null){
                    visitFuncandstruct(ctx.funcandstruct());
                }

            } else if (ctx.ESTRUCTURA() != null) {
                System.out.print("static class "+ctx.ID().getText()+"{\n");
                myWriter.write("static class "+ctx.ID().getText()+"{\n");
                if(ctx.structcontent()!=null){
                    visitStructcontent(ctx.structcontent());
                }
                System.out.print("\n}\n");
                myWriter.write("\n}\n");
                if(ctx.funcandstruct()!=null){
                    visitFuncandstruct(ctx.funcandstruct());
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitDeclarearguments(MiLenguajeParser.DeclareargumentsContext ctx) {
        try{
            visitType(ctx.type());
            System.out.print(" "+ctx.ID().getText()+" ");
            myWriter.write(" "+ctx.ID().getText()+" ");
            visitDeclareargumentslist(ctx.declareargumentslist());
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitDeclareargumentslist(MiLenguajeParser.DeclareargumentslistContext ctx) {
        try{
            if(ctx.TK_COMA()!=null){
                System.out.print(", ");
                myWriter.write(", ");
                visitType(ctx.type());
                System.out.print(" "+ctx.ID().getText()+" ");
                myWriter.write(" "+ctx.ID().getText()+" ");
                visitDeclareargumentslist(ctx.declareargumentslist());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitMainfunction(MiLenguajeParser.MainfunctionContext ctx) {
        try{
            System.out.print("public static void main(String[] args) {\n");
            myWriter.write("public static void main(String[] args) {\n");
            visitInstructionlist(ctx.instructionlist());
            System.out.print("\n}\n");
            myWriter.write("\n}\n");
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitType(MiLenguajeParser.TypeContext ctx) {
        try{
            if(ctx.BOOLEANO()!=null){
                System.out.print("boolean");
                myWriter.write("boolean");
            }
            if(ctx.CARACTER()!=null){
                System.out.print("char");
                myWriter.write("char");
            }
            if(ctx.ENTERO()!=null){
                System.out.print("int");
                myWriter.write("int");
            }
            if(ctx.REAL()!=null){
                System.out.print("double");
                myWriter.write("double");
            }
            if(ctx.CADENA()!=null){
                System.out.print("String");
                myWriter.write("String");
            }
            if(ctx.ID()!=null){
                System.out.print(ctx.ID().getText());
                myWriter.write(ctx.ID().getText());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitStandardtype(MiLenguajeParser.StandardtypeContext ctx) {
        try{
            if(ctx.BOOLEANO()!=null){
                System.out.print("boolean");
                myWriter.write("boolean");
            }
            if(ctx.CARACTER()!=null){
                System.out.print("char");
                myWriter.write("char");
            }
            if(ctx.ENTERO()!=null){
                System.out.print("int");
                myWriter.write("int");
            }
            if(ctx.REAL()!=null){
                System.out.print("double");
                myWriter.write("double");
            }
            if(ctx.CADENA()!=null){
                System.out.print("String");
                myWriter.write("String");
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitFunccontent(MiLenguajeParser.FunccontentContext ctx) {
        try{
            visitFninstructionlist(ctx.fninstructionlist());
            System.out.print("return ");
            myWriter.write("return ");
            visitExpression(ctx.expression());
            //pyc
            System.out.print(";\n");
            myWriter.write(";\n");
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T visitStructcontent(MiLenguajeParser.StructcontentContext ctx) {
        try{
            if(ctx.standardtype()!=null){
                visitStandardtype(ctx.standardtype());
                System.out.print(" "+ctx.ID(0).getText()+" ");
                myWriter.write(" "+ctx.ID(0).getText()+" ");
                if(ctx.declarationlist()!=null){
                    visitDeclarationlist(ctx.declarationlist());

                }else{
                    System.out.print("=");
                    myWriter.write("=");
                    visitExpression(ctx.expression());
                    visitDeclarationlist(ctx.declarationlist());
                }
                System.out.print(";\n");
                myWriter.write(";\n");
                if(ctx.structcontent()!=null){
                    visitStructcontent(ctx.structcontent());
                }

            }else if(ctx.ID(0)!=null){

                System.out.print(ctx.ID(0).getText()+" ");
                myWriter.write(ctx.ID(0).getText()+" ");
                System.out.print(ctx.ID(1).getText()+" ");
                myWriter.write(ctx.ID(1).getText()+" ");
                if(ctx.declarationlist()!=null){
                    visitDeclarationlist(ctx.declarationlist());

                }else{
                    System.out.print("=");
                    myWriter.write("=");
                    visitExpression(ctx.expression());
                    visitDeclarationlist(ctx.declarationlist());
                }
                System.out.print(";\n");
                myWriter.write(";\n");
                if(ctx.structcontent()!=null){
                    visitStructcontent(ctx.structcontent());
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }


}
