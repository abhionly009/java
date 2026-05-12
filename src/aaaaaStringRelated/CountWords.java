package aaaaaStringRelated;

public class CountWords {

    public static int count(String input){

        String [] arr = input.trim().split(" ");
        return arr.length;

    }

    public static void main(String[] args) {

        String input = " Hello world ";
        System.out.println(count(input));
    }
}
