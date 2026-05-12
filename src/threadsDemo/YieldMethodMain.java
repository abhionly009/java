package threadsDemo;

public class YieldMethodMain {

    public static void main(String[] args) {

        YieldMethodExample t1 = new YieldMethodExample();

        t1.start();

        YieldThreadExample2 t2 = new YieldThreadExample2();

        t2.start();

        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
        }

    }
}
