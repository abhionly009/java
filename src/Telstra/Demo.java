package Telstra;

public class Demo {

   int x = 23;

   class IC {
       int y =27;
   }

    public static void main(String[] args) {

       Demo myOuter = new Demo();
       Demo.IC myInner = myOuter.new IC();
        System.out.println(myInner.y+myOuter.x);

    }
}
