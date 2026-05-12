package aaaaaaaPracticeForIBS.string;

public class ConvertToLowerCase {

    public static String toLowerCase(String input){

        StringBuilder stringBuilder = new StringBuilder();

        char [] arr = input.toCharArray();

        for (char ch:arr){

            stringBuilder.append( (char) ((int)ch+32));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        System.out.println(toLowerCase("ABHI"));

    }
}
