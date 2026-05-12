package aaaaaStringRelated;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountCharacterOccurance {

    public static void count(String string){

        Map<Character,Integer> map = new TreeMap<>();
        char [] arr = string.toCharArray();

        for (int i =0;i<arr.length;i++){
            if (arr[i]== ' '){
                continue;
            }


            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }

        System.out.println(map);

    }

    public static void main(String[] args) {


        String input = "Hello world";

        count(input);
    }
}
