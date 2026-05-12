package aaaaaStringRelated;

public class RemoveWhiteSpace {

    public static String removeIt(String input){
        return input.replace(" ","");

    }

    public static void main(String[] args) {

        String input = "Hello world I am grok";
        String cleanedData =   removeIt(input);
        System.out.println(cleanedData);

    }
}
