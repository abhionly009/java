package synechron;

public class IdGeneratorMain {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        });

        t1.start();
        t2.start();

    }
}
