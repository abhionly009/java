import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequency {

    public static void countOccurrence(){

        String input = "abhinandan shah";


        char []arr = input.toCharArray();

        Map<Character,Integer > map= new HashMap<>();

        for (int i=0;i<arr.length;i++){

            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);

            }else {
                map.put(arr[i],1);
            }
        }

        System.out.println(map);
    }



public static void main(String[] args) {


    String input = "abhinandan shah";
    countOccurrence();
    System.out.println("Above output from brute force");

    Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c).
            collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    System.out.println(collect);
}

}
