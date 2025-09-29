package Sep13;

public class AnynomousClassWithMultiThreading {


    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = ()->System.out.println("Thread is running: "+Thread.currentThread().getName());
        Runnable r2 = ()->System.out.println("Thread is running: "+Thread.currentThread().getName());

        Thread t1 = new Thread(r1,"Thread1");
        Thread t2 = new Thread(r2,"Thread2");
        System.out.println( t1.getState());
        System.out.println( t2.getState());

        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(5000);
        System.out.println(t1.getState());

        t2.start();

        System.out.println(Thread.activeCount());
        System.out.println("this is the program end");



        System.out.println( t1.getState());
        System.out.println( t2.getState());







    }


}
