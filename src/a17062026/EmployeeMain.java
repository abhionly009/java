package a17062026;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

    public Stream<String> findListOfEmployeesWhoseSalaryIsGreaterThan80000(List<Employee> employees){
       return employees.stream().filter(employee -> employee.getSalary()>80000)
                .map(employee -> employee.getName() + " : " + employee.getSalary());
    }


    public static void main(String[] args) {

        EmployeeUtils employeeUtils = new EmployeeUtils();

       List<Employee> employees = employeeUtils.getEmployees();

      EmployeeMain employeeMain = new EmployeeMain();
     Stream<String> stream = employeeMain.findListOfEmployeesWhoseSalaryIsGreaterThan80000(employees);

       stream.forEach(System.out::println);
//
//
//        employees.stream().max(Comparator.comparing(Employee::getSalary))
//                .map(employee -> employee.getName() +" " + employee.getSalary())
//                .ifPresent(System.out::println);
//
//
//        employees.stream().min(Comparator.comparing(Employee::getSalary)).map(employee -> employee.getName() + " : "+ employee.getSalary())
//                .ifPresent(System.out::println);
//
//
//        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
//                .entrySet().stream().forEach(System.out::println);
//
//        employees.stream().collect(Collectors.partitioningBy(employee -> employee.getSalary()>80000))
//                .entrySet().stream()
//                        .forEach(System.out::println);
//
//
//        employees.stream().collect(Collectors.groupingBy(employee -> employee.getSalary()>80000
//        ? "Greater Than 80000" : "less than ",
//                Collectors.mapping(Employee::getName,Collectors.toList())
//        )).entrySet().stream().forEach(System.out::println);
//
//
//
//        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment))
//                .entrySet().stream()
//                .forEach(System.out::println);
//
//
//        employees.stream().collect(Collectors.groupingBy(employee -> employee.isActive()
//        ? "Active" : " Non Active",
//                Collectors.mapping(Employee::getName,Collectors.toList())
//        )).entrySet().stream().forEach(System.out::println);
//
//
//      double totalSalary =  employees.stream()
//                .map(Employee::getSalary)
//                .reduce(0.0,Double::sum);
//
//        System.out.println(totalSalary);
//
//        double averageSalary = employees.stream()
//                .collect(Collectors.averagingDouble(Employee::getSalary));
//
//        System.out.println(averageSalary);
//
//
//        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
//                .entrySet().stream().map(stringOptionalEntry -> stringOptionalEntry.getValue().map(Employee::getName))
//                .forEach(System.out::println);
//
//
//        employees.stream().sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder()))
//                .map(employee -> employee.getName() + " : " +employee.getSalary() )
//                .skip(1).limit(1).forEach(System.out::println);
//
//
//        Double it = employees.stream().filter(employee -> employee.getDepartment().equalsIgnoreCase("IT"))
//                .collect(Collectors.summingDouble(Employee::getSalary));
//
//
//        System.out.println("Total salary of IT department " + it);
//
//
//
//
//        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//                        Collectors.summingDouble(Employee::getSalary)))
//                .entrySet().stream().forEach(System.out::println);
//
//
//        boolean b = employees.stream()
//                .allMatch(employee -> employee.getSalary()>4000);
//        System.out.println(b);
//
//
//        employees.stream().sorted(Comparator.comparing(Employee::getDepartment))
//                .collect(Collectors.toList()).stream().forEach(System.out::println);
//
//        // longest tenure employee
//
//        employees.stream().min(Comparator.comparing(Employee::getJoiningDate))
//                .ifPresent(System.out::println);

    }
}
