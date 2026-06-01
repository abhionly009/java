package numberRelated;

public class Fibonacci {

    public static void main(String[] args) {

        int range = 10;
        int a = 0;
        int b = 1;
        for (int i =0;i<range;i++){

            System.out.print(" " +a);

            int c = a+b;
            a = b;
            b = c;
        }

    }

}
