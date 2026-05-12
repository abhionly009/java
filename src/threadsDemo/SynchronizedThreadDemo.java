package threadsDemo;

public class SynchronizedThreadDemo {
    public static void main(String[] args) {

        ThreadForSynchronized t1 = new ThreadForSynchronized();
        t1.setPriority(8);
        t1.start();

        MyThread t2 = new MyThread();
        t2.setPriority(2);
        t2.start();
    }
}
