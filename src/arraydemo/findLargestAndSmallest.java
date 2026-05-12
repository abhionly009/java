package arraydemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class findLargestAndSmallest {

    public static void largest(int [] arr, int nth){

        if (nth>arr.length){
            return ;
        }

        Stream<Integer> limit = Arrays.stream(arr).boxed()
                .distinct().sorted(Comparator.reverseOrder()).skip(nth).limit(1);

        limit.forEach(System.out::println);

    }

    public static void smallest(int [] arr, int nth){

        if (nth>arr.length){
            return ;
        }

        Stream<Integer> limit = Arrays.stream(arr).boxed()
                .distinct().sorted().skip(nth).limit(1);

        limit.forEach(System.out::println);

    }

    public static void main(String[] args) {

        int []arr = {12,4,6,8,2,1,90,45};
        largest(arr,1);
        smallest(arr,0);
    }
}
