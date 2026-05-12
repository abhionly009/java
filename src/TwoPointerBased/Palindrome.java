package TwoPointerBased;

public class Palindrome {


    public static boolean checkPalindrome(String str){

        char [] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while (left<right){

            if (arr[left]!=arr[right]){

                return false;
            }
            left++;
            right--;

        }
        return true;


    }


    public static void main(String[] args) {

       boolean outcome =  checkPalindrome("racecar");

       if (outcome){
           System.out.println("Palindrome");
       }else {
           System.out.println(" Not A Palindrome");
       }

    }
}
