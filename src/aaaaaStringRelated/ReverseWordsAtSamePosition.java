package aaaaaStringRelated;

public class ReverseWordsAtSamePosition {



    public static String reverse(String input){

        String [] arr = input.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String string : arr) {

            sb.append(ReverseString.reverse(string)).append(" ");

        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String input = "Hello My name is adam";
       String str = reverse(input);

        System.out.println(str);
    }
}
