package java8;

public class Test2 implements DemoDefaultMethodInInterface{
    @Override
    public int square(int n) {
        System.out.println("inside Test 2 class");
        return n*n;
    }
}
