package threadsDemo;

public class YieldThreadExample2 extends Thread{

    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("Child 2");

        }
    }
}
