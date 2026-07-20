package aOperationOnyourName;


import java.util.stream.Stream;

public class FindConsonants {

    public int[] find(String name){


        char [] arr = name.toLowerCase().toCharArray();
        int vowelCount = 0;
        int consonantCount = 0;
        int result [] = new int[2];

        for (int i =0;i<arr.length;i++){
            char ch = arr[i];
            if (Character.isLetter(ch) ){

                if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
                    vowelCount++;
                }else {
                    consonantCount++;
                }
            }


        }
        result[0] = vowelCount;
        result[1] = consonantCount;
        return result;
    }

    public static void main(String[] args) {

        FindConsonants consonants = new FindConsonants();

        int [] result = consonants.find("Abhinandan k");

        System.out.println("Total vowels in your name  " +result[0]);
        System.out.println("Total consonants in your name  " +result[1]);

    }
}
