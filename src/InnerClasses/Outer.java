package InnerClasses;

public class Outer {

    int x =10;
    static int mu = 345;
    class Inner {
        int x = 100;

        public void m2(){
            System.out.println(x);
        }
        class InnerMost{

            int x =1000;


            public void m1(){
                x = 34;
                System.out.println(x);
                System.out.println(mu);
                m2();
            }
        }
    }
}
