package a05062026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoUnsortedListIntoOneSorted {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,4,2,5,9);
        List<Integer> list2 = Arrays.asList(3,10,15,7);


        List<Integer> result = Stream.concat(list2.stream(),list2.stream()).sorted().toList();

        System.out.println(result);

    }
}
