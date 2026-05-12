package java8;

public interface DemoDefaultMethodInInterface {

      default void m1(){
        System.out.println("Inside m1 of DemoDefaultMethodInInterface");
    }


    public int square(int n);

      static void m2(){
          System.out.println("Inside m2 of interface");
      }
}
