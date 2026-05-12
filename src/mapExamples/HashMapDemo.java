package mapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {


        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("Abhinandan",10);
        hashMap.put("Shivam",6);
        hashMap.put("Aarati",6);
        hashMap.put("Pihu",4);


        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        entries.forEach(System.out::println);
        entries.stream().map(Map.Entry::getValue).forEach(System.out::println);
    }
}
