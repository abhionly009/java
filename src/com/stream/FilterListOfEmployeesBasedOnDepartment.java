package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilterListOfEmployeesBasedOnDepartment {

    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("abhinandan","SE",10,24));
        employees.add(new Employee("Harshit","HR",8,43));
        employees.add(new Employee("Sahil","MRK",9,35));
        employees.add(new Employee("Suman","MRK",6,34));
        employees.add(new Employee("Krishna","SE",8,28));
        employees.add(new Employee("Roushani","SE",3,12));
        employees.add(new Employee("Seema","MRK",7,36));

        // find how many employees are there in department
        Map<String, List<String>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.mapping(Employee::getName,
                        Collectors.toList()
                )));

        System.out.println(collect);


        // count the number of employees working in a department
//        Map<String, Long> collect1 = employees.stream().
//                collect(Collectors.groupingBy(Employee::getDept, Collectors.mapping(Employee::getDept, Collectors.counting())));
//
//
//        System.out.println(collect1);


        Map<String, Long> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

        System.out.println(collect1);


    }
}
