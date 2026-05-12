package streamExamples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

    public static void main(String[] args) {


        ArrayList<Employee> employees = new ArrayList<>();



        employees.add(new Employee("Abhinandan", 33,9,30,"SE"));
        employees.add(new Employee("Aarati", 30,7,31,"HR"));
        employees.add(new Employee("Kumar", 32,6,30,"IT"));
        employees.add(new Employee("Harshit", 23,6,40,"SE"));
        employees.add(new Employee("Gaurav", 31,10,24,"MR"));
        employees.add(new Employee("Deepak", 29,6,20,"SUP"));
        employees.add(new Employee("kunal", 27,7,18,"SUP"));
        employees.add(new Employee("Shalu", 25,5,12,"SUP"));


//        Map<String, Optional<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(Employee::getAnnualSalary))));


//        System.out.println(collect1);


        Map<String, Optional<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(Employee::getAnnualSalary))));


        System.out.println(collect1);


//        List<Employee> list = employees.stream().filter(emp -> emp.getAnnualSalary() > 30).toList();
////        System.out.println(list);
////
//
//        Map<Integer, Long> collect = employees.stream().
//                collect(Collectors.groupingBy(Employee::getYoe, Collectors.counting()));
//
////        System.out.println(collect);
////        Stream<Employee> sorted = employees.stream().sorted(Comparator.comparingDouble(Employee::getAnnualSalary));
//
//        Stream<Employee> limit = employees.stream().sorted(Comparator.comparing(Employee::getAnnualSalary).reversed()).distinct().skip(1).limit(3);
//
//
//        Stream<Employee> sorted = employees.stream().
//                sorted(Comparator.comparing(Employee::getYoe).reversed()
//                        .thenComparing(Employee::getAge).reversed())
//                ;
//
////        limit.forEach(System.out::println);
//
//
////        sorted.forEach(System.out::println);
    }
}
