package java8;

public class MainClass {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.square(3));
        test1.m1();

        Test2 test2 = new Test2();
        System.out.println(test2.square(3));
        test2.m1();

        DefaultMethod test3 = new DefaultMethod();
        System.out.println(test3.square(3));
        test3.m1();

    }
}
