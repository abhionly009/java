package atomic;

public class StackOverFlowDemo {

    public void f1(){
        f1();
    }

    public static void main(String[] args) {
        StackOverFlowDemo stackOverFlowDemo = new StackOverFlowDemo();
        stackOverFlowDemo.f1();
    }
}
