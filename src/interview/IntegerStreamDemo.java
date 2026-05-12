package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerStreamDemo {
    public static void main(String[] args) {


        List<Integer> marks = Arrays.asList(43,52,55,12,55,90,76,99,66,99,100,98,100,55,99);

        List<Integer> collect = marks.stream().distinct().sorted(Comparator.reverseOrder()).toList();


        if (collect.size()<2){
            System.out.println("there is not enough data to find second highest number");
            return;
        }

        int secondHighest = collect.get(1);


        long count = marks.stream().filter(n->n== secondHighest).count();

        System.out.println("Second Highest number is " +secondHighest +" and it appears in list " + count +" times");

    }
}
