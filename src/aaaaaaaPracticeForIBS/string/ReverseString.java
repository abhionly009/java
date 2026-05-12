package aaaaaaaPracticeForIBS.string;

public class ReverseString {

    public static String reverse(String input){

        StringBuilder stringBuilder = new StringBuilder();
        char [] arr = input.toCharArray();
        int left = 0;
         int right = arr.length-1;

         while (left<right){
             char temp = arr[right];
             arr[right] = arr[left];
             arr[left] = temp;
             left++;
             right--;
         }

        return stringBuilder.append(arr).toString();

    }

    public static void main(String[] args) {

        String str = new String("Hello world");

        System.out.println(str);

      String reversedString =   reverse(str);
        System.out.println(reversedString);

    }
}
