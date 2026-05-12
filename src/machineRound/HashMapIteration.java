package machineRound;

import java.util.*;

public class HashMapIteration {

    public static void main(String[] args) {

        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

       Set<Character> characters =  map.keySet();

      Collection<Integer> values =  map.values();

      for(Integer i : values){
          System.out.println(i);
      }

       for(Character c :characters){
           System.out.println(c);
       }


//        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
//            System.out.println(characterIntegerEntry);
//        }
    }
}
