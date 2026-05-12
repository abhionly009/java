package aaaaaaaPracticeForIBS.string;

public class ReverseWordAtPosition {

    public static String reverseWord(String input){
        char [] arr = input.toCharArray();
        int left = 0;
        int right = arr.length -1;
        StringBuilder sb = new StringBuilder();
        while (left<right){

            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }

       return sb.append(arr).toString();
    }

    public static String reverse(String input){

        String [] words = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word:words ){
            stringBuilder.append(reverseWord(word) +" ");
        }

     return stringBuilder.toString();
    }

    public static void main(String[] args) {

        String sentence = "Hello I am Abhinandan";

        System.out.println(sentence);
       String reversed = reverse(sentence);

        System.out.println(reversed);
    }
}
