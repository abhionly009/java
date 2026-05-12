package conversion;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int convertToInt(String str){

        Map<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int totalCount =0;
        int prevValue =0;

        for (int i = str.length()-1;i>=0;i--){
//            System.out.println(i);
            int current = map.get(str.charAt(i));

            if (current<prevValue){
                totalCount -= current;

            }else{
                totalCount += current;
            }
            prevValue = current;

            System.out.println( "for I = " + i + " prevValue " + prevValue + "  current " + current + " total " + totalCount);
        }
        return totalCount;
    }

    public static void main(String[] args) {

        convertToInt("MCMXCIV");
//        System.out.println(convertToInt("MCMXCIV"));


    }
}
