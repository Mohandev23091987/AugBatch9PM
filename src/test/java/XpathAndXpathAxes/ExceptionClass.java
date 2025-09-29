package XpathAndXpathAxes;

import java.io.IOException;

public class ExceptionClass {


    static void validateAge(int age)  {

        if(age<18){
           throw new ArithmeticException("");
        }else{
            System.out.println();
        }
    }


    public static void main(String[] args)  {

        try {
            validateAge(10);
        }
        catch(ArithmeticException e){
            System.out.println("caught exception");
        }

    }
}
