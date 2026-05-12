package machineRound;

public class PalindromeNumber {

    public static void IsPalindrome(int number){


        int reverse = 0;

        int temp = number;

        while (temp>0){
            reverse = (reverse *10) + (temp%10);
            temp = temp /10;

        }

        if (reverse == number){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {

        IsPalindrome(-121);

    }
}
