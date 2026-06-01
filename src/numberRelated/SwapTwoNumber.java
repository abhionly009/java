package numberRelated;

public class SwapTwoNumber {

    public static void main(String[] args) {

        int a = 12;
        int b = 33;

        System.out.println(a);
        System.out.println(b);

        System.out.println("-----------After swap -----------");
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a);
        System.out.println(b);
    }
}
