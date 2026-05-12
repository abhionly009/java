package aaaaaaaPracticeForIBS.string;

public class FirstNonRepeatingCharacter {

    public static char findNonRepeatingCharacter(String input){
        char [] arr = input.toCharArray();
        int left = 0;
        int right = input.length()-1;
        char ch = '_';
        while (left<right){
            if (arr[left] != arr[right] ){

                ch = arr[left];

            }
            left++;
            right--;

        }
        return ch;
    }

    public static void main(String[] args) {

        System.out.println(findNonRepeatingCharacter("swiss"));
    }
}
