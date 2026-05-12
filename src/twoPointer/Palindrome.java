package twoPointer;

public class Palindrome {

    public static boolean isPalindrome(String data){

        int left = 0;
        int right = data.length()-1;

        char [] arr = data.toCharArray();

        while (left<right){
            if (arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

          boolean value =   isPalindrome("racecar");
        System.out.println(value);

        boolean result = isPalindrome("repaper");
        System.out.println(result);

    }
}
