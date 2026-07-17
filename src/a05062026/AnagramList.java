package a05062026;

import java.util.*;

public class AnagramList {

    public void placeInSameList(List<String> words){

        Map<String,List<String>> map = new HashMap<>();

        for (String word:words){
             char [] arr = word.toCharArray();


             Arrays.sort(arr);

             String key = new String(arr);

            map.computeIfAbsent(key, k -> new ArrayList<>())
                    .add(word);
        }

        map.entrySet()
                .stream().forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<String> words = List.of("eat","tea","tan","nat","ate","bat");

        AnagramList list = new AnagramList();
        list.placeInSameList(words);

    }
}
