package aOperationOnyourName;

public class PalindromeCheck {

    public boolean isPalindrome(String name){

        int left = 0;
        int right = name.length()-1;
        char [] arr = name.toCharArray();
        boolean result = true;

        while(left<right){

            if (arr[left]!=arr[right]){
                return false;
            }else {
                left++;
                right--;
            }

        }
        return result;

    }

    public static void main(String[] args) {

        PalindromeCheck palindromeCheck = new PalindromeCheck();

        boolean result = palindromeCheck.isPalindrome("abhinandan");
        System.out.println(result);

    }
}
