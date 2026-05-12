package aaaaaStringRelated;


public class ReverseString {

    public static String reverse(String input){

        StringBuilder sb = new StringBuilder();

        char [] reversedChar = input.toCharArray();

        int left = 0;
        int right = input.length()-1;

        while (left<right){
            char temp = reversedChar[right];
            reversedChar[right] = reversedChar[left];
            reversedChar[left] = temp;
            left++;
            right--;

        }
      return  sb.append(reversedChar).toString();
    }

    public static void main(String[] args) {

        String input = "Hello World";

        String reversedString = reverse(input);

        System.out.println(input);
        System.out.println(reversedString);

    }
}
