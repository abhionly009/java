package com.stream;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllAboutStream {

    //1. Get a list of all employee names.
    public static void getNameOfAllEmployees(List<Employee> employees){

        List<String> collect = employees.stream().map(Employee::getName).collect(Collectors.toList());

        System.out.println(collect);
    }



    //Find the employee with the maximum salary
    public static void findEmployeeWithHighestSalary(List<Employee> employees){

        Stream<Employee> limit = employees.stream().distinct()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(1);

        limit.forEach(System.out::println);
    }



    //Find the youngest employee.
    public static void findTheYoungestEmployee(List<Employee>employees){

        Stream<Employee> limit = employees.stream().sorted(Comparator.comparing(Employee::getAge)).limit(1);

        System.out.println(limit.findFirst());
    }

    //Count how many employees have more than X Salary

    public static void FindEmployeesWithMoreThanXSalary(List<Employee> employees, int input){

        long count = employees.stream().filter(emp -> emp.getSalary() > input).count();

        System.out.println(count);
    }

    //Sort the employees by name
    public static void sortEmployeeByName(List<Employee> employees){
        List<Employee> collect = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

            collect.stream().forEach(System.out::println);

    }


    //Sort the employees by salary descending

    public static void sortEmployeeBasedInputAndOrder(List<Employee> employees, String fieldName, boolean ascendingOrder){
        Field field = null;
        try {
            field =  Employee.class.getDeclaredField(fieldName);
            field.setAccessible(true);

            Field finalField1 = field;
            Comparator<Employee> comparator = Comparator.comparing(emp -> {
                try {
                    return (Comparable) finalField1.get(emp);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            });

            if (!ascendingOrder) {
                comparator = comparator.reversed();
            }

            List<Employee> collect = employees.stream()
                    .sorted(comparator)
                    .collect(Collectors.toList());

            System.out.println(collect);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }



    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Abhinandan","SE",30,24));
        employees.add(new Employee("Harshit","HR",24,43));
        employees.add(new Employee("Sahil","MRK",26,35));
        employees.add(new Employee("Suman","MRK",26,34));
        employees.add(new Employee("Krishna","SE",28,28));
        employees.add(new Employee("Roushani","SE",33,12));
        employees.add(new Employee("Seema","MRK",37,36));


        getNameOfAllEmployees(employees);

//        findEmployeeWithHighestSalary(employees);

//        findTheYoungestEmployee(employees);

//        FindEmployeesWithMoreThanXSalary(employees,30);


//        sortEmployeeByName(employees);

        sortEmployeeBasedInputAndOrder(employees, "salary",false);
    }
}
