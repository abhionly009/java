package com.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOnEmployee {


    public static Optional<Employee> findHighestSalaryEmployee(List<Employee>employees){

        Stream<Employee> limit = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(1);
        return limit.findFirst();
    }

    public static List<String> findNamesOfEmployeeWorkingIn(List<Employee> employees,String dept){

       return employees.stream().filter(employee -> employee.getDept().equals(dept))
                .map(Employee::getName).toList();

    }


    public static void findNthHighestSalary(List<Employee> employees, int nthSalary){

        Optional<Employee> first = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).
                skip(nthSalary - 1).findFirst();
        System.out.println(first.get());
    }


    public static void sortBasedOnSalaryAndThenByName(List<Employee>employees){

        List<Employee> list = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Comparator.comparing(Employee::getAge).reversed())).toList();

        list.forEach(System.out::println);

    }


    public static void getAllTheEmployeeWorkingIn(List<Employee> employees){

        Map<String, List<String>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(collect);
    }


    public static void countEmployeeInEachDept(List<Employee> employees){

        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        System.out.println(collect);

    }



    public static void sumOfSalaryPerDept(List<Employee>employees){
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.summingLong(Employee::getSalary)));

        System.out.println(collect);
    }


    public static void avgOfSalaryPerDept(List<Employee>employees){
        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingLong(Employee::getSalary)));

        System.out.println(collect);
    }




    public static void highestPaidEmployeePerDept(List<Employee>employees){

        Map<String, Optional<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));


        System.out.println(collect);
    }




    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Abhinandan","IT",34,26));
        employeeList.add(new Employee("Kunal","HR",20,12));
        employeeList.add(new Employee("Sarita","HR",24,46));
        employeeList.add(new Employee("Salini","MKT",25,29));
        employeeList.add(new Employee("Shristi","MKT",30,16));
        employeeList.add(new Employee("Rohan","IT",28,43));
        employeeList.add(new Employee("Megha","HR",31,32));

       Optional<Employee> employee = findHighestSalaryEmployee(employeeList);

//        System.out.println(employee.get());


//        List<String> names = findNamesOfEmployeeWorkingIn(employeeList,"IT");
//
//        if (!names.isEmpty()){
//            for (String name :names){
//                System.out.println(name);
//            }
//        }else {
//            System.out.println("There is no employee with dept you provided ");
//        }



//       findNthHighestSalary(employeeList,1);

//        sortBasedOnSalaryAndThenByName(employeeList);


//        getAllTheEmployeeWorkingIn(employeeList);

//        countEmployeeInEachDept(employeeList);

//        sumOfSalaryPerDept(employeeList);

//        avgOfSalaryPerDept(employeeList);


        highestPaidEmployeePerDept(employeeList);
    }
}
