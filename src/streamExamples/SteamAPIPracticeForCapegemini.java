package streamExamples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamAPIPracticeForCapegemini {
    public static void main(String[] args) {


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Abhinandan", 33,9,39,"SE"));
        employees.add(new Employee("Aarati", 30,7,31,"HR"));
        employees.add(new Employee("Kumar", 32,6,30,"IT"));
        employees.add(new Employee("Harshit", 23,6,40,"SE"));
        employees.add(new Employee("Gaurav", 31,10,24,"MR"));
        employees.add(new Employee("Deepak", 29,6,20,"SUP"));
        employees.add(new Employee("kunal", 23,7,9,"SUP"));
        employees.add(new Employee("Shalu", 19,5,12,"SUP"));



        /** Print all employee names.*/

        //employees.stream().map(Employee::getName).forEach(System.out::println);

        /** Print names of employees whose age is greater than 30.*/

      //  employees.stream().filter(employee -> employee.getAge()>30).map(Employee::getName).forEach(System.out::println);

        /**
         * Find total number of employees.
         */

//        long count = employees.stream().count();
//
//        System.out.println(count);


        /**
         * Find all employees belonging to IT department.
         */

//        employees.stream().filter(employee -> employee.getDept().equals("IT")).forEach(System.out::println);

        /**
         * Find employees whose salary is greater than 10 lakh.
         */

//        employees.stream().filter(employee -> employee.getAnnualSalary()>10).forEach(System.out::println);


        /**
         * Print all department names.
         */
//        employees.stream().map(Employee::getDept).forEach(System.out::println);


        /**
         * Print distinct department names.
         */
//        employees.stream().map(Employee::getDept).distinct().forEach(System.out::println);

        /**
         * Find employee with maximum salary.
         */
//       employees.stream().max(Comparator.comparing(Employee::getAnnualSalary)).ifPresent(System.out::println);

        /**
         * Find employee with minimum age.
         */
//        employees.stream().min(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);

        /**
         * Sort employees by age.
         */

//        employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);


        /**
         * Sort employees by salary descending order.
         */
//        employees.stream().sorted(Comparator.comparing(Employee::getAnnualSalary,Comparator.reverseOrder())).forEach(System.out::println);


        /**
         * Get list of employee names only.
         */
//        List<String> list = employees.stream().map(Employee::getName).toList();
//        System.out.println(list);

        /**
         * Increase salary of every employee by 10% and print.
         */
//
//        employees.stream().map(employee -> employee.getAnnualSalary()+ (employee.getAnnualSalary()*10)/100)
//                .forEach(System.out::println);

        /**
         * Find employees whose experience is greater than 5 years.
         */

//        employees.stream().filter(employee -> employee.getYoe()>5).forEach(System.out::println);

        /**
         * Check if any employee belongs to HR department.
         */
//        boolean hr = employees.stream().anyMatch(employee -> employee.getDept().equals("HR"));
//        System.out.println(hr);

        /**
         * Check if all employees have salary greater than 3 lakh.
         */
//        boolean b = employees.stream().allMatch(employee -> employee.getAnnualSalary() > 3);
//        System.out.println(b);


        /**
         * Find first employee from Finance department.
         */

//        employees.stream().collect(Collectors.groupingBy(employee -> employee.getDept().equals("Finance")))
//                .entrySet().stream().findFirst().ifPresent(System.out::println);

        /**
         * Skip first 3 employees and print remaining.
         */
//        employees.stream().skip(3).forEach(System.out::println);


        /**
         * Limit stream to first 5 employees.
         */

//        employees.stream().limit(5).filter(employee -> employee.getAnnualSalary()>25)
//                .map(Employee::getName)
//                .forEach(System.out::println);

        /**
         * Count employees whose age is between 25 and 35.
         */

//        employees.stream().filter(employee -> employee.getAge()>=25 && employee.getAge()<=35).map(Employee::getName)
//                .forEach(System.out::println);


        /**
         * Group employees by department.
         */
//    employees.stream().collect(Collectors.groupingBy(Employee::getDept))
//            .entrySet().stream().forEach(System.out::println);


        /**
         * Count employees in each department.
         */

//        employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting())).entrySet().stream()
//                .forEach(System.out::println);

        /**
         * Find average salary of employees.
         */
//        double v = employees.stream().collect(Collectors.averagingDouble(Employee::getAnnualSalary)).doubleValue();
//        System.out.println(v);


        /**
         * Find average salary department-wise.
         */

//        employees.stream().collect(Collectors.groupingBy(Employee::getDept))
//                .entrySet().stream().forEach(entry->{
//                    entry.getValue().stream().map(Employee::getName).forEach(System.out::println);
//                } );

//        employees.stream().collect(Collectors.groupingBy(Employee::getDept))
//                .forEach((dept,emplist)->{
//                    System.out.print(dept +" ");
//                    emplist.stream().map(Employee::getName).forEach(System.out::println);
//                    System.out.println(" ");
//                });


        /**
         * Find highest paid employee in each department.
         */
//        employees.stream().collect(Collectors.groupingBy(Employee::getDept,
//                Collectors.maxBy(Comparator.comparing(Employee::getAnnualSalary))))
//                .entrySet()
//                .stream()
//                .forEach(System.out::println);


        /**
         * Find youngest employee in each department.
         */
//        employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.minBy(Comparator.comparing(Employee::getAge))))
//                .entrySet().stream()
//                .forEach(System.out::println);

        /**
         * Convert list of employees into map with:
         * key = employee name
         * value = salary
         */

//        employees.stream()


        /**
         * Find total salary expenditure of company.
         */
//        double sum = employees.stream().mapToDouble(Employee::getAnnualSalary).sum();
//        System.out.println(sum);

        /**
         * Find second highest salary employee.
         */

//        employees.stream().sorted(Comparator.comparing(Employee::getAnnualSalary,Comparator.reverseOrder()))
//                .skip(1).limit(1)
//                .forEach(System.out::println);

        /**
         * Find top 3 highest paid employees.
         */
//        employees.stream().sorted(Comparator.comparing(Employee::getAnnualSalary,Comparator.reverseOrder()))
//                .limit(3).forEach(System.out::println);


        /**
         * Find employees sorted by:
         * department
         * then salary descending
         */

//        employees.stream().sorted(Comparator.comparing(Employee::getDept)
//                .thenComparing(Employee::getAnnualSalary,Comparator.reverseOrder()))
//                .forEach(System.out::println);


        /**
         * Partition employees into:
         * salary > 10 lakh
         * salary <= 10 lakh
         */


//       employees.stream().collect(Collectors.partitioningBy(employee -> employee.getAnnualSalary() > 10))
//               .forEach((is,emplist)->{
//                   System.out.println("Employees with salary greater than 10 " +is);
//                   emplist.stream().map(Employee::getName).toList().stream().forEach(System.out::println);
//                   System.out.println();
//               });


        /**
         * Join all employee names into comma separated string.
         */


    }
}
