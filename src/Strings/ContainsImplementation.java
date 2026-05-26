package Strings;

import java.util.HashMap;
import java.util.Map;

public class ContainsImplementation {

    public static boolean isAvailable(String original, String toFind){

        Map<String,String> map = new HashMap<>();
        int foundLength = toFind.length();

        for (int i = 0 ;i<original.length()-toFind.length()+1;i++){
            String str = original.substring(i,foundLength);
            map.put(str,str);
            foundLength++;
        }
        System.out.println(map);
        return map.containsKey(toFind);
    }

    public static void main(String[] args) {
        String input = "interview";
        System.out.println(  isAvailable(input,"view"));

    }

}
