package stream.p18_05_2026;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        List<EmployeeData> employees = new ArrayList<>();

        employees.add( new EmployeeData("Abhinandan","SE",10,34,40));
        employees.add(new EmployeeData("Harshit","HR",9,33,41));
        employees.add(new EmployeeData("Sahil","MRK",6,25,30));
        employees.add(new EmployeeData("Suman","MRK",2,23,14));
        employees.add(new EmployeeData("Krishna","SE",5,28,25));
        employees.add(new EmployeeData("Roushani","SE",3,28,23));
        employees.add(new EmployeeData("Seema","MRK",7,36,37));
        employees.add(new EmployeeData("Gaurav","IT",3,32,24));
        employees.add(new EmployeeData("Mayank","IT",6,33,22));

        //Get all employees whose salary is greater than 25
        employees.stream().filter(employee -> employee.getAnnualSalary()>25).forEach(System.out::println);

        //Get all employees name whose salary is greater than 25

        employees.stream().filter(employee -> employee.getAnnualSalary()>35)
                .map(EmployeeData::getName)
                .forEach(System.out::println);

        // Get all employees name and salary whose salary is greater than 35

        employees.stream().filter(employeeData -> employeeData.getAnnualSalary()>35)
                .map(emp->emp.getName()  + " : " + emp.getAnnualSalary() )
                .forEach(System.out::println);


        // sort employees based on salary in ascending order

        employees.stream().sorted(Comparator.comparing(EmployeeData::getAnnualSalary))
                .map(emp->emp.getName() + " :" + emp.getAnnualSalary())
                .forEach(System.out::println);

        System.out.println("--------------------Descending order -------------------");

        // sort employees based on salary in descending order

        employees.stream().sorted(Comparator.comparing(EmployeeData::getAnnualSalary,Comparator.reverseOrder()))
                .map(emp->emp.getName() + " : "+ emp.getAnnualSalary())
                .forEach(System.out::println);


        // sort employee based on salary then sort based on yoe
        employees.stream().sorted(Comparator.comparing(EmployeeData::getAnnualSalary).thenComparing(EmployeeData::getYoe))
                .map(emp->emp.getName() + " : "+ emp.getAnnualSalary() + " : " +emp.getYoe())
                .forEach(System.out::println);

        // find number of employees working in each dept

        employees.stream().collect(Collectors.groupingBy(EmployeeData::getDept, Collectors.counting()))
                .entrySet().stream().forEach(System.out::println);


        // highest earning employee
        employees.stream().max(Comparator.comparing(EmployeeData::getAnnualSalary))
                .map(EmployeeData::getName)
                .ifPresent(System.out::println);


//         Highest earning employees in each dept

        employees.stream().collect(Collectors.groupingBy(EmployeeData::getDept, Collectors.maxBy(
                Comparator.comparing(EmployeeData::getAnnualSalary)
        ))).entrySet().stream()
                .map(stringOptionalEntry -> stringOptionalEntry.getKey() + " "
                        + stringOptionalEntry.getValue().get().getName() + ": "
                        + stringOptionalEntry.getValue().get().getAnnualSalary())
                .forEach(System.out::println);


    }
}
