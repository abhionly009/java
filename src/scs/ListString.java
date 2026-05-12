package scs;

import javax.naming.Name;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListString {

    // list of string abhinandan, mithun;



    public static void main(String[] args) {

        List<String> names = new ArrayList<>();


        names.add("Abhinandan");
        names.add("Mithun");
        names.add("Abhinandan");
        names.add("Sanjay");
        names.add("Harshit");
        names.add("Sonal");
        names.add("Sanjay");names.add("Sanjay");
        names.add("Sanjay");
        List<String> collect2 = names.stream().collect(Collectors.filtering((name) -> name.length() > 6, Collectors.toList()));

//        System.out.println(collect2);

        Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);


        //Integer array[] =[1,1,0,1,0] -> output : [0,0,1,1,1]
//        Integer [] array ={1,1,0,1,0};
//        Stream<Integer> stream = Arrays.stream(array);
//        Long collect1 = stream.count();
//
//        System.out.println(collect1);

//        Stream<Integer> sorted = stream.sorted();
//
//        sorted.forEach(System.out::print);
    }

//    select * from Strudent join on table2 where  Student.id = table2.id;

}


