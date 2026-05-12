package generics;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class demo {

    public static <T> void printArray(T[] arr){

        for (T value :arr){
            System.out.println(value);
        }
    }


    public static void main(String[] args) {

//        char [] arr = {'A','B','H','I','N','A','N','D','A','N'};
//
//
//        String name = new String(arr);
//
//        Map<Character,Integer> countVowels = new HashMap<>();


//        intStream.forEach(System.out::println);

//        Box<String> stringBox = new Box<>();
//        stringBox.set("Hello");
//
//        System.out.println(stringBox.getValue());
//
//        Box<Integer> s = new Box<>();
//        s.set(342);
//        System.out.println(s.getValue());
//
//
//        Integer[] intArray = {1, 2, 3, 4};
//        String[] strArray = {"Java", "Python", "C++"};
//
//        printArray(intArray);
//        printArray(strArray);

        System.out.println("inside main method");

//        main(new String[]{"call -again"});// stack over flow error

    }
}
