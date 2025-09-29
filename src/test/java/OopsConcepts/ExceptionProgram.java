package OopsConcepts;

public class ExceptionProgram {


    void sum(){
        System.out.println("this is sum method");
    }


    static void validateAge(int age) throws Exception {
        if(age<18){
                throw new Exception();
        }else{
            System.out.println("eligible for voting");
        }

    }


    public static void main(String[] args) {

        try {
            validateAge(10);
        }

        catch(Exception e){
            System.out.println("exception occured");
        }



//     catch(ArithmeticException e){
//         System.out.println(e.getMessage());
//     }
//
//     catch( NullPointerException e ){
//         e.printStackTrace();
//     }
//
//     catch (IndexOutOfBoundsException e){
//         System.out.println(e.getMessage());
//         //System.exit(0);
//
//     }
//
//     catch (Exception e){
//
//     }

     finally{
         System.out.println(" this is finally block");
     }

        // AthematicException obj
        System.out.println("I am your tutor");




    }
}
