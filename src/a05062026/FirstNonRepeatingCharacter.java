package a05062026;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public char findCharacter(String input){
        char result = ' ';
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()== 1){
                result = entry.getKey();
                break;
            }
        }
        return result;

    }

    public static void main(String[] args) {

        FirstNonRepeatingCharacter firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();

        char result =  firstNonRepeatingCharacter.findCharacter("swisii");

        System.out.println(result);

    }
}
