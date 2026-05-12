package threaddemo;

public class ThreadMain {
    public static void main(String[] args) {


        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("main method");
        System.out.println(Thread.activeCount());
    }
}
