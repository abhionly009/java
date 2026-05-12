package aaaaNumberRelated;

/**
 * Reverse a Number
 * Input: 1234 → Output: 4321
 */
public class ReverseNumber {

    public static int reverse(int n){

        int rem = 0;
        int rev = 0;

        while (n>0){
            rem = n%10;
            rev = rev * 10 +rem;
            n = n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int input = 12345;
        int rev = reverse(input);
        System.out.println("the reverse of given number "+ input  +" is " + rev);
    }
}
