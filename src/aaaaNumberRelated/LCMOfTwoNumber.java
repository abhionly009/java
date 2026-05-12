package aaaaNumberRelated;

public class LCMOfTwoNumber {

    public static int gcd (int a, int b){

        while (b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
    return a;
    }

    public static int lcm(int a,int b){

        return (a*b)/gcd(a,b);


    }



    public static void main(String[] args) {

      int lcm =  lcm(18,12);
        System.out.println(lcm);
    }
}
