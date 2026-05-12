package machineRound;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {


    public static int romanToInt(String s) throws RomanNumberDoesNotExistException{

        Map<Character,Integer> romanMap = new HashMap<>();

        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int result = 0;

        for (int i=0;i<s.length();i++){

            if (!romanMap.containsKey(s.charAt(i))){
                throw  new RomanNumberDoesNotExistException("There is no roman number as " + s.charAt(i));
            }

            if (i>0 && romanMap.get(s.charAt(i))>romanMap.get(s.charAt(i-1))){

                result += romanMap.get(s.charAt(i))-2* romanMap.get(s.charAt(i-1));
            }else{
                result += romanMap.get(s.charAt(i));
            }
        }
        return result;

    }

    public static void main(String[] args) throws RomanNumberDoesNotExistException {



        System.out.println(romanToInt("LIV"));



    }
}



