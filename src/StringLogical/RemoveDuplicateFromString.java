package StringLogical;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateFromString {

    public static String eliminateDuplicate(String str){

        Set<Character> set = new HashSet<>();

        for (char ch:str.toCharArray()){
            set.add(ch);
        }

        StringBuilder stringBuffer = new StringBuilder();

        for (char c:set){
            stringBuffer.append(c);
        }

        return stringBuffer.toString();

    }

    public static char firstNonRepeatingChar(String s) {
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }

        return '_'; // or throw exception
    }

    public static boolean isRotation(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
//
//        System.out.println( eliminateDuplicate("Abhinandan"));
//        System.out.println(firstNonRepeatingChar("heello Io am abhinandan"));


        String s1 = "abhinandan";
        String s2 = s1+"shah";

        System.out.println( isRotation("waterbottle","erbottlewatx"));

        s1 = "Rahul";
        System.out.println(s1);
        System.out.println(s2);
    }

}
