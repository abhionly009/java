package day23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringCompression {

    public String compress(String input){

        if (input == null){
            throw new NullPointerException("Input can not be null");
        }

        Map<Character,Integer> map = new HashMap<>();

        for (int i =0;i<input.length();i++){

            char ch = input.charAt(i);

            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        for (Map.Entry<Character, Integer> entry :entries){
            stringBuilder.append(entry.getKey() + ""+ entry.getValue());
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
    StringCompression compression = new StringCompression();
        System.out.println(compression.compress("aaabbc"));

    }

}
