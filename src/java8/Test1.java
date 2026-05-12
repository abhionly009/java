package java8;

public class Test1 implements DemoDefaultMethodInInterface{
    @Override
    public int square(int n) {
        System.out.println("in side Test1");
        DemoDefaultMethodInInterface.m2();

        return n*n;
    }

    @Override
    public void m1(){
        System.out.println("Inside m1 of test1");
    }

}
