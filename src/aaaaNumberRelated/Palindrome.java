package aaaaNumberRelated;

/**
 * Palindrome Number
 * 121 --> true
 * 134 --> false
 */
public class Palindrome {


    public static boolean isPalindrome(int n){

        int original = n;
        int rem = 0;
        int rev =0;

        while (n>0){
            rem = n%10;
            rev = rev*10 +rem;
            n = n/10;
        }
        return original == rev;
    }

    public static void main(String[] args) {
        int input = 4;

        System.out.println("Given number is palindrome --> "+isPalindrome(input));
    }
}
