package aaaaaaaaaaaaaaaaaapiStreamString;

public class CountVowelInGivenString {

    public static void main(String[] args) {

        String input = "Hello world";

        long count =  input.chars().mapToObj(ch->(char) ch).filter(ch->"aeiouAEIOU".indexOf(ch)!=-1).count();

        System.out.println(count);

    }
}
