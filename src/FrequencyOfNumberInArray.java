import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfNumberInArray {

    public static void main(String[] args) {

        int [] arr = {1,2,4,1,6,6,1,1,6,3,5,6,3,5,6,9};

        Map<Integer, Long> collect = Arrays.stream(arr)
                .mapToObj(i -> i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Map.Entry<Integer, Long>> collect1 = collect.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
