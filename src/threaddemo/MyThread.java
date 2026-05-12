package threaddemo;

public class MyThread extends Thread{
    public void start(){
        super.start();
        System.out.println("Start method");
    }

    @Override
    public void run() {
        System.out.println("run method");
    }
}
