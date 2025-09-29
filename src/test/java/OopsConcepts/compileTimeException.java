package OopsConcepts;

public class compileTimeException {


    int m1(){
        try{
            int c =10/0;
           return 10;
        }


        catch(ArithmeticException obj){
            System.out.println();
            return 20;
        }


        catch(Exception e){
            return 20;
        }



    }

    public static void main(String[] args)  {


        compileTimeException obj = new compileTimeException();

        System.out.println(obj.m1());




    }

    //custom creation




}
