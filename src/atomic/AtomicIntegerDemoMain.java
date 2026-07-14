package atomic;

public class AtomicIntegerDemoMain {

    public static void main(String[] args) {

        AtomicCounter counter = new AtomicCounter();

        Runnable r1 = ()->{
            System.out.println( counter.increment());
        };


        Runnable r2 = ()->{
            System.out.println( counter.increment());
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }

}
