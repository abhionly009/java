package FunctionalExampleDemo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

    public static boolean isVowel(char c){
        if (c =='a' || c =='e' || c=='i'|| c=='o'|| c=='u'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

//        NonReadable nonReadable =(msg)-> {
//            System.out.println("Hi " + msg);
//        };
//
//        nonReadable.printData("Virat Kohli");


//        Map<Integer,String> map = new HashMap<>();
//
//
//        map.put(1,"Abhinandan");
//        map.put(2,"Harshit");
//        map.put(3,"Mayank");
//        map.put(4,"Ankan Saha");
//
//        map.entrySet().stream().filter((item)->item.getValue().startsWith("A"))
//                .forEach((item)->
//                System.out.println(item.getValue().toUpperCase()));



        String da = "Hello";
        Map<Boolean, List<Character>> collect = da.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.partitioningBy((c) -> isVowel(c)));

        collect.entrySet().stream().forEach(System.out::println);

    }
}
