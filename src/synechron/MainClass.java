package synechron;

public class MainClass {

    public static void main(String[] args) {

        IdProvider idProvider = new IdProviderImpl();

        Runnable r1 = ()->{
            System.out.println(idProvider.getId());

            System.out.println(Thread.currentThread().getName() +" " + System.nanoTime());
        };

        Runnable r2 = ()-> {
            System.out.println(idProvider.getId());
            System.out.println(Thread.currentThread().getName() +" " + System.nanoTime());

        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();



    }
}
