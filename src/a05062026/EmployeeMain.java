package a05062026;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        // find all the employee working in IT department

        List<Employee> it = employees.stream().filter(employee -> employee.getDepartment().equals("IT"))
                .toList();

        System.out.println(it);

// 2. Find employees with salary > 80000.

        List<String> list = employees.stream()
                .filter(employee -> employee.getSalary() > 8000)
                .map(Employee::getName)
                .toList();
        System.out.println(list);


 // 3. Find active employees.

        List<String> list1 = employees.stream().filter(employee -> employee.isActive())
                .map(Employee::getName)
                .toList();

        System.out.println(list1);

        // 4. Find employees from Bangalore.

        List<String> city = employees.stream().filter(employee -> employee.getCity().equalsIgnoreCase("Bangalore"))
                .map(Employee::getName)
                .toList();

        System.out.println(city);


        //5. Find employees older than 30.
        List<String> list2 = employees.stream().filter(employee -> employee.getAge() > 30)
                .map(Employee::getName)
                .toList();

        System.out.println(list2);


        // 6. Get list of employee names.

        employees.stream().map(Employee::getName).forEach(System.out::println);

        // 7. Get list of employee salaries.

        employees.stream().map(Employee::getSalary).forEach(System.out::print);


        // 8. Convert names to uppercase.
        employees.stream().map(employee -> employee.getName().toUpperCase()).forEach(System.out::println);

        // 9. Get unique department names.

        employees.stream().map(employee -> employee.getDepartment()).distinct().forEach(System.out::println);


        // 10. Get employee name and city.

        employees.stream().map(employee -> employee.getName() + " ---> " +  employee.getCity())
                .forEach(System.out::println);


        // 11. Sort employees by salary ascending.

       employees.stream().sorted(Comparator.comparing(Employee::getSalary))
               .map(Employee::getSalary)
                .forEach(System.out::println);

        // 12. Sort employees by salary descending.

        employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()) )
                .map(Employee::getSalary)
                .forEach(System.out::println);

        // 13. Sort employees by age.

        employees.stream().sorted(Comparator.comparing(Employee::getAge))
                .map(Employee::getAge)
                .forEach(System.out::println);


        // 14. Sort employees by joining date.
        employees.stream().sorted(Comparator.comparing(Employee::getJoiningDate))
                .map(Employee::getJoiningDate)
                .forEach(System.out::println);


        // 15. Sort employees by department then salary.

        employees.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary))
                .map(employee -> employee.getDepartment()  + " " + employee.getSalary())
                .forEach(System.out::println);

        // 16. Find distinct departments.

        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        // 17. Find distinct cities.

        employees.stream().map(Employee::getCity).distinct()
                .forEach(System.out::println);

        // 18. Count total employees.

        long count = employees.stream().count();
        System.out.println(count);

        // 19. Count employees in IT.

       long totalITEmployees = employees.stream().filter(employee -> employee.getDepartment().equalsIgnoreCase("IT"))
                .count();

        System.out.println(totalITEmployees);

    //20. Count active employees.

        long activeEmployee = employees.stream().
                filter(employee -> employee.isActive())
                .count();

        System.out.println(activeEmployee);

        // 21. Highest paid employee.

        Optional<String> s = employees.stream().max(Comparator.comparing(Employee::getSalary))
                .map(employee -> employee.getName() + " " + employee.getSalary());
        System.out.println(s.get());

        // 22. Lowest paid employee.
        Optional<String> s1 = employees.stream().min(Comparator.comparing(Employee::getSalary))
                .map(employee -> employee.getName() + " " + employee.getSalary());

        System.out.println(s1.get());


        //23. Youngest employee.
        employees.stream().min(Comparator.comparing(Employee::getAge))
                .map(Employee::getAge).ifPresent(System.out::println);

        // 24. Oldest employee
        employees.stream()
                .max(Comparator.comparing(Employee::getAge))
                .map(Employee::getAge)
                .ifPresent(System.out::println);

        // 25. Group employees by department.
//
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet().stream().forEach(System.out::println);

        // 26. Group employees by city.

        employees.stream().collect(Collectors.groupingBy(Employee::getCity))
                .entrySet().stream().forEach(System.out::println);
        ;

        // 27. Group employees by gender.

        employees.stream().collect(Collectors.groupingBy(Employee::getGender))
                .entrySet().stream().forEach(System.out::println);

        // 28. Count employees per department.

        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream().forEach(System.out::println);

//        29. Average salary per department.

        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().stream().forEach(System.out::println);


        // 30. Highest salary per department.

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
                .entrySet().stream().forEach(System.out::println);

        // 31. Partition employees by active status.

        employees.stream().collect(Collectors.partitioningBy(Employee::isActive))
                .entrySet().stream().forEach(System.out::println);


        // 32. Partition employees by salary > 80000.

        employees.stream().collect(Collectors.partitioningBy(employee -> employee.getSalary()>80000))
                .entrySet().stream()
                .forEach(System.out::println);
        ;


        //33. Partition employees by age > 30.

        employees.stream().collect(Collectors.partitioningBy(employee -> employee.getAge()>30))
                .entrySet().stream()
                .forEach(System.out::println);

        // 34. Total salary of all employees.

        Double totalSalary = employees.stream().map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println(totalSalary);


        // 35. Average salary.
        Double collect = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println(collect);


        // 36. Sum of IT employee salaries.

        Double it1 = employees.stream().filter(employee -> employee.getDepartment().equalsIgnoreCase("IT"))
                .collect(Collectors.summingDouble(Employee::getSalary));

        System.out.println(it1);


        // 37. Highest salary.

        employees.stream().max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

        // 38. Lowest salary
        employees.stream().min(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);


        // 39. Are all employees active?
       boolean any = employees.stream().allMatch(Employee::isActive);
        System.out.println(any);

        //42. First employee from IT.

         employees.stream()
                 .filter(employee -> employee.getDepartment().equalsIgnoreCase("HR"))
                .findFirst()
                 .ifPresent(System.out::println);

         // 43. Any employee from HR.

        employees.stream().filter(employee -> employee.getDepartment().equalsIgnoreCase("HR"))
                .findAny().ifPresent(System.out::println);

        // 44. First employee with salary > 100000.

        employees.stream().filter(employee -> employee.getSalary()>100000)
                .findFirst()
                .ifPresent(System.out::println);


        // 45. Second highest salary employee.

       employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                .skip(1).limit(1).findFirst().ifPresent(System.out::println);



        // 46. Third highest salary employee.

        employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                .skip(2).limit(1)
                .findFirst().ifPresent(System.out::println);

        // 47. Top 3 highest paid employees.

        employees.stream().sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder()))
                .limit(3).forEach(System.out::println);


        // 48. Employee with longest tenure.
        employees.stream().min(Comparator.comparing(Employee::getJoiningDate)).ifPresent(System.out::println);



        // 49. Department with highest average salary.

        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().stream().forEach(System.out::println);

        // 50. Group employee names by department.

        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())))
                .entrySet().stream().forEach(System.out::println);


        // 51. Find duplicate employee names.


        // 53. Highest paid employee in each department.
            employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                            Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
                    .entrySet().stream().forEach(System.out::println);

        // 54. Youngest employee in each department.

        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparing(Employee::getAge))))
                .entrySet().stream().forEach(System.out::println);

        // 55. Employees joined after 2022 grouped by city.

        Map<String, List<Employee>> collect1 = employees.stream().filter(employee -> employee.getJoiningDate().getYear() > 2022)
                .collect(Collectors.groupingBy(Employee::getCity));

        System.out.println(collect1);

    }
}
