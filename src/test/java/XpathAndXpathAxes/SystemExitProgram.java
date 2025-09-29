package XpathAndXpathAxes;

public class SystemExitProgram {

    public static void main(String[] args) {

        System.out.println("this is first line");

        System.out.println("this is the last");
        try{

            System.out.println("try");
            System.exit(1);
        }

        catch(Exception e){
            System.out.println("catch");
        }
        finally{
            System.out.println("finally");


        }
    }
}
