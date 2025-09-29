package Sep13;

public class CreateThreadRunnableInterface implements Runnable {


    @Override
    public void run() {
        System.out.println("Thread is running: "+Thread.currentThread().getName());
    }


    public static void main(String[] args) {

        Thread t1 = new Thread(new CreateThreadRunnableInterface(),"Thread1");
        Thread t2 = new Thread(new CreateThreadRunnableInterface(),"Thread2");

        t1.start();
        t2.start();


        System.out.println(Thread.activeCount());
        System.out.println("this is the program end");






    }


}
