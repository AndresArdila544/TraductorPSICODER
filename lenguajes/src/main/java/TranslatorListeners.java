import java.io.FileWriter;
import java.io.IOException;

public class TranslatorListeners extends MiLenguajeBaseListener{
    FileWriter myWriter;
    public TranslatorListeners(FileWriter myWriter) {
        this.myWriter = myWriter;
    }

    @Override
    public void enterProgram(MiLenguajeParser.ProgramContext ctx) {
        System.out.print("public class Main {\n");
        try{
            myWriter.write("public class Main {\n");
        }catch(IOException e){
            e.printStackTrace();
        }


    }

    @Override
    public void exitProgram(MiLenguajeParser.ProgramContext ctx) {
        System.out.print("}\n");
        try{
            myWriter.write("}\n");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void enterFuncandstruct(MiLenguajeParser.FuncandstructContext ctx) {
        try {
            if (ctx.FUNCION() != null) {


                System.out.print("public static "+ctx.type().getText()+" "+ctx.ID().getText()+ " ");
                myWriter.write("public static "+ctx.type().getText()+" "+ctx.ID().getText()+ " ");
            } else if (ctx.ESTRUCTURA() != null) {

            } else {

            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }


    @Override
    public void exitFuncandstruct(MiLenguajeParser.FuncandstructContext ctx) {
        System.out.print("end");
        try{
            myWriter.write("end");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
