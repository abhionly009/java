package aOperationOnyourName;

import java.util.HashMap;
import java.util.Map;

public class ContainsFunctionality {

    public boolean contains(String name,char target){

        Map<Character,Boolean> map = new HashMap<>();

        for (Character ch :name.toCharArray()){
            map.put(ch,true);
        }

         return map.containsKey(target);
        }

    public static void main(String[] args) {

        ContainsFunctionality containsFunctionality = new ContainsFunctionality();

        boolean result =  containsFunctionality.contains("Abhinandan",'z');

        System.out.println(result);



    }
}
