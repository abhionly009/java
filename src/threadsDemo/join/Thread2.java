package threadsDemo.join;

public class Thread2 extends Thread{

    public void run (){

        for(int i =0; i<10;i++){
            System.out.println("thread 2...");
        }

    }
}
