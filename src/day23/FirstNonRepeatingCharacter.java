package day23;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public char findCharacter(String input){

        char result = ' ';

        if (input == null){
            throw new NullPointerException("Input should not be empty");
        }

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

        String input = "aabbcdde";

        FirstNonRepeatingCharacter firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();

       char output = firstNonRepeatingCharacter.findCharacter(input);
        System.out.println(output);

    }
}
