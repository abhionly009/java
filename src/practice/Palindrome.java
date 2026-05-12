package practice;

public class Palindrome {


    public static boolean isPalindrome(int input){

        int original = input;

        int rev = 0;
        int rem = 1;

        while (input>0){
            rem = input%10;
            rev = rem + rev * 10;
            input = input/10;
        }


        if (original == rev){
            return true;

        }
else{
            return false;
        }

    }


    public static void main(String[] args) {

       boolean d =  isPalindrome(1219);
        System.out.println(d);

    }
}
