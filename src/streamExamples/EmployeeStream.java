package streamExamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class EmployeeStream {

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
        filterEmployees(employees);

        getAllEmployeeName(employees);

         employeeWithMaxSalary(employees);

        employeeWithMoreYOE(employees);

        getYoungestEmployee(employees);

        employeesWithMoreThanFiveYearsExperience(employees);
System.err.println("------------------------------------");
        sortEmployeeBasedOnSalaryInDesc(employees);
    }


    /**
     * This method will take list of employees as input process the data and display the employees
     * whose year of experience is > 6 and salary is >= 20 in ascending order based on name
     */
    public static void filterEmployees(List<Employee> employees){

        Predicate<Employee> salary = emp->emp.getAnnualSalary()>=20;
        Predicate<Employee> experience = emp->emp.getYoe()>6;
        Stream<Employee> employeeStream = employees.stream().filter(salary.and(experience)).sorted();

        employeeStream.forEach(System.out::println);
    }


    public static void sortEmployeeBasedOnSalaryInDesc(List<Employee> employees){
        Stream<Employee> sorted = employees.stream().sorted(Comparator.comparingDouble(Employee::getAnnualSalary));

        
        sorted.forEach(System.out::println);

    }

    public static void getAllEmployeeName(List<Employee> employees){
        employees.stream()
                .map(Employee::getName)
//                .filter(name -> name.length()>5)
                .sorted().forEach(System.out::println);
    }

    public static void employeeWithMaxSalary(List<Employee> employees){
        Optional<Employee> max = employees.stream().max(Comparator.comparingDouble(Employee::getAnnualSalary));
        System.out.println("Max Salary Employee Details");
        max.ifPresent(System.out::println);
    }

    public static void employeeWithMoreYOE(List<Employee> employees){

        Optional<Employee> maxExperience = employees.stream().max(Comparator.comparingInt(Employee::getYoe));
        System.out.println("Highest Year of experience Employee Details");
        maxExperience.ifPresent(System.out::println);
    }


    /*
    * Find the youngest employee
    * */
    public static void getYoungestEmployee(List<Employee> employees){

        Optional<Employee> min = employees.stream().min(Comparator.comparingInt(Employee::getAge));

        System.out.println("Youngest employee details");

        min.ifPresent(System.out::println);
    }


    /*
     * How many employees has more than 5 years of experience
     * */
    public static void employeesWithMoreThanFiveYearsExperience(List<Employee> employees){

        Predicate<Employee> fiveYears = emp->emp.getYoe()>5;
        long count = employees.stream().filter(fiveYears).count();

        System.err.println(count);

    }

}
