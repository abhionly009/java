package mapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindNonRepeatingCharacter {


    public static Character getNonRepeatingCharacter(String input ){

        HashMap<Character,Integer> countHolder = new HashMap<>();
        char [] chars = input.toCharArray();

        for(Character ch :chars){
                countHolder.put(ch,countHolder.getOrDefault(ch,0) +1);

        }

       for(Map.Entry<Character, Integer> entries : countHolder.entrySet()){
           if (entries.getValue()==1){
               return entries.getKey();
           }
       }



return null;
    }

    public static void main(String[] args) {

        String data = "swiss";

        Character result = getNonRepeatingCharacter(data);
        System.out.println(result);

    }
}
