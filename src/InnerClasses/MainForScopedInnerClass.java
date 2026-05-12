package InnerClasses;

public class MainForScopedInnerClass {

    public static void main(String[] args) {

        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        Outer.Inner.InnerMost im = i.new InnerMost();

        im.m1();

    }
}
