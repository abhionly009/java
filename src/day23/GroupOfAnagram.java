package day23;

import java.util.*;

public class GroupOfAnagram {

    public  static List<List<String>> findListAnagram(String [] input){

        Map<String,List<String>> map = new HashMap<>();

        for (String str: input){

            char [] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.computeIfAbsent(key, k->new ArrayList<>())
                    .add(str);
        }
        return new ArrayList<>(map.values());

    }


    public static void main(String[] args) {

        String [] input = {"eat","tea","tan","ate","nat","bat"};

       List<List<String>> list =  findListAnagram(input);

       list.stream().forEach(System.out::println);

    }
}
