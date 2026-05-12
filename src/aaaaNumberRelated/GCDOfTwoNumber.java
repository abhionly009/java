package aaaaNumberRelated;

public class GCDOfTwoNumber {

    public static int gcd(int a, int b){
        int rem = 0;
        while (b!=0){
            rem = a%b;
            a =b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {

        int gcd = gcd(18,12);
        System.out.println(gcd);

    }
}
