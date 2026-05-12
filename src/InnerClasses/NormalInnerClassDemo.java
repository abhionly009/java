package InnerClasses;

public class NormalInnerClassDemo {

    public final double  PI = 3.14;


    class InnerClass {

        public void m1(){
            System.out.println("Inner class method");
        }

    }

    public static void main(String[] args) {

        NormalInnerClassDemo n = new NormalInnerClassDemo();

        NormalInnerClassDemo.InnerClass i = n.new InnerClass();

        i.m1();

//        NormalInnerClassDemo.InnerClass i1 = new NormalInnerClassDemo().new InnerClass();

       // new NormalInnerClassDemo().new InnerClass().m1();

    }
}
