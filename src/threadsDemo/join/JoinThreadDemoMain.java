package threadsDemo.join;

public class JoinThreadDemoMain {

    public static void main(String[] args) throws InterruptedException {

        Thread1 t1 = new Thread1();

        t1.start();
        Thread2 t2 = new Thread2();

        t2.start();
        t1.join();



            for(int i =0; i<15;i++){
                System.out.println("Main ....");
            }



    }
}
