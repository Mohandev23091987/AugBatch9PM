package Sep13;

public class CreatingMultiThreads extends Thread {

    public CreatingMultiThreads(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println("Thread execution by using Thread class"+Thread.currentThread().getName());
    }
    public static void main(String[] args) throws InterruptedException {

        CreatingMultiThreads t1 = new CreatingMultiThreads("Thread1");
        CreatingMultiThreads t2 = new CreatingMultiThreads("Thread2");
        CreatingMultiThreads t3 = new CreatingMultiThreads("Thread3");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

        System.out.println(Thread.activeCount());
        System.out.println("end of the program");




    }
}
