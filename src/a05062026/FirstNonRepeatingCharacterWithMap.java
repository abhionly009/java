package a05062026;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingCharacterWithMap {


    public char findNonRepeatingCharacter(String input){

        char result = ' ';
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (int i =0;i<input.length();i++){
            char ch = input.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries =map.entrySet();
        for (Map.Entry<Character,Integer> entry :entries){

            if (entry.getValue()==1){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        FirstNonRepeatingCharacterWithMap firstNonRepeatingCharacter = new FirstNonRepeatingCharacterWithMap();

        char result = firstNonRepeatingCharacter.findNonRepeatingCharacter("abhinandan");

        if (result!= ' '){

            System.out.println(result);
        }else{
            System.out.println("No result found!");
        }




    }
}
