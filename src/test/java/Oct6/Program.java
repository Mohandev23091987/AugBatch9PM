package Oct6;

public class SIngleTonProgram {

    public static void main(String[] args) {




        SingleTonPattern instance1 = SingleTonPattern.getInstance();
        System.out.println(instance1.hashCode());


        Runnable executionCode = () ->{
            SingleTonPattern.getInstance().printMessage();
        };

        //functional interface
        //ananymous class concept
        //lambda expressions

        //mutlithereading
        //lambad expression


        //

        //creating methods
        Thread th1 = new Thread(executionCode);
        Thread th2 = new Thread(executionCode);
        Thread th3 = new Thread(executionCode);

        th1.start();
        th2.start();
        th3.start();




    }
}
