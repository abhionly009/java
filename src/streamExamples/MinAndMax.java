package streamExamples;

import java.util.Arrays;
import java.util.List;

public class MinAndMax {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(11, 13,1,10,11,7, 5,4,7,3,9, 20, 7, 3, 30);

        int max = listOfIntegers.stream().max(Integer::compareTo).get();

        System.out.println("Max number is "+max);

        int min = listOfIntegers.stream().min(Integer::compareTo).get();

        System.out.println("Min number is " + min);

        List<Integer> distinctNumbers = listOfIntegers.stream().distinct().toList();

        System.out.println(distinctNumbers);

        int distinctMin = listOfIntegers.stream().distinct().min(Integer::compareTo).get();

        System.out.println(distinctMin);

    }

}
