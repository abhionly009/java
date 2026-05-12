package java8;

public class DefaultMethod implements DemoDefaultMethodInInterface
{
    @Override
    public int square(int n) {
        System.out.println("inside Default method class");
        return n*n;
    }
}
