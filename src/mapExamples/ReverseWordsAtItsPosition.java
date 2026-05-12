package mapExamples;

import java.util.HashMap;

public class ReverseWordsAtItsPosition {

    public static void reverse(String sentence){

        String [] arr = sentence.split(" ");

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++){

//                System.out.print(arr[i].reverse());

            }
        }

    }


    public static void main(String[] args) {
reverse("My name is Abhinandan");
    }
}
