package aaaaaaaaaaaaaaCapeGemini;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("abhinandan","SE",10,24, Arrays.asList("Bangalore","Mumbai","Pune")));
        employees.add(new Employee ("Harshit","HR",8,43,Arrays.asList("Delhi","Hyderabad","Pune")));
        employees.add(new Employee("Sahil","MRK",9,36,Arrays.asList("Chennai","Hyderabad")));
        employees.add(new Employee("Suman","MRK",6,34,Arrays.asList("Bangalore","Pune")));
        employees.add(new Employee("Krishna","SE",8,28,Arrays.asList("Delhi","Mumbai","Chennai")));
        employees.add(new Employee("Roushani","SE",3,12,Arrays.asList("Lucknow","Bangalore")));
        employees.add(new Employee("Seema","MRK",7,36,Arrays.asList("Bangalore","Mumbai","Pune")));


    // find the name of employees whose working city is more than 2

//        List<String> collect = employees.stream().filter(employee -> employee.getCity().stream().count() > 2)
//                .map(employee -> employee.getName()).collect(Collectors.toList());
//
//        System.out.println(collect);

    // find number of employees working in each dept

//        Map<String, Long> collect1 = employees.stream().collect(Collectors.groupingBy(employee -> employee.getDept(), Collectors.counting()));
//
//        System.out.println(collect1);


        // find second highest salary earning employee

        Stream<Employee> limit = employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())).distinct().skip(1).limit(1);

        System.out.println(limit.findAny().get().getName());

    }


}
