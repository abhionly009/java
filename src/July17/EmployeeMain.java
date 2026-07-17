package July17;

import a05062026.Employee;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {


    public static void main(String[] args) {

        List<EmployeeInfo> employees = ListOfEmployee.getEmployeeInfos();

        // Find all employees whose salary is greater than 50,000.
//
//        employees.stream().filter(emp->emp.getSalary()>50000)
//                .forEach((employeeInfo ->
//                    System.out.println(employeeInfo.getName() +" " + employeeInfo.getSalary())));

        // Find all employees from the "IT" department.
//        employees.stream().filter(employeeInfo -> employeeInfo.getDepartment().equals("IT"))
//                .forEach((employeeInfo)-> System.out.println( employeeInfo.getName()+ " "+employeeInfo.getDepartment()));


        // Get a list of all employee names.

//        employees.stream().map(employeeInfo -> employeeInfo.getName()).forEach(System.out::println);


        // Get a list of all employee salaries.


//        employees.stream().map(EmployeeInfo::getSalary).forEach(System.out::println);


        // Count the total number of employees.

//        System.out.println(employees.stream().count());


        // Find the employee with the highest salary.

        Optional<EmployeeInfo> max = employees.stream().max(Comparator.comparing(EmployeeInfo::getSalary));

//        System.out.println(max.get());

        // Find the employee with the lowest salary.

//        EmployeeInfo employeeInfo = employees.stream().min(Comparator.comparing(EmployeeInfo::getSalary)).get();
//        System.out.println(employeeInfo);


        // Find the employee with the second-highest salary.
//        employees.stream().sorted(Comparator.comparing(EmployeeInfo::getSalary, Comparator.reverseOrder()))
//                .skip(1).limit(1).findFirst().ifPresent(System.out::println);

        // Calculate the total salary of all employees.

        Double reduce = employees.stream().map(employeeInfo -> employeeInfo.getSalary())
                .reduce(0.0, Double::sum);

//        System.out.println("Total salary of employees " +reduce);

        // Calculate the average salary of all employees.


//        Double collect = employees.stream().collect(Collectors.averagingDouble(EmployeeInfo::getSalary));
//
//        System.out.println(collect);


        // Find employees whose age is greater than 30.

//        employees.stream().filter(employeeInfo -> employeeInfo.getAge()>30)
//
//
//                .forEach(employeeInfo -> {
//                    System.out.println(employeeInfo.getName() + " " + employeeInfo.getAge());
//                });


        // Sort employees by salary in ascending order.

//        employees.stream().sorted(Comparator.comparing(EmployeeInfo::getSalary)).forEach((employeeInfo -> {
//            System.out.println(employeeInfo.getName() +"  " + employeeInfo.getSalary());
//        }));


        // Sort employees by salary in descending order.
//        employees.stream().sorted(Comparator.comparing(EmployeeInfo::getSalary,Comparator.reverseOrder())).forEach((employeeInfo -> {
//            System.out.println(employeeInfo.getName() +"  " + employeeInfo.getSalary());
//        }));


        // Sort employees by name alphabetically.

//        employees.stream().sorted(Comparator.comparing(EmployeeInfo::getName))
//                .map(EmployeeInfo::getName)
//                .forEach(System.out::println);


//        Find the first employee whose salary is greater than 100,000.


        EmployeeInfo employeeInfo1 = employees.stream()
                .filter(employeeInfo -> employeeInfo.getSalary() > 100000)
                .findFirst().get();

//        System.out.println(employeeInfo1);


        // Find all unique departments.

//        employees.stream().map(employeeInfo -> employeeInfo.getDepartment())
//                .distinct().toList().stream().forEach(System.out::println);

        // Count the number of employees in the "IT" department.

        long it = employees.stream().filter(employeeInfo -> employeeInfo.getDepartment().equals("IT")).count();

//        System.out.println("Total employee in IT " + it);


        // Find employees whose name starts with "A".

//        employees.stream().filter(employeeInfo -> employeeInfo.getName().startsWith("A"))
//                .map(employeeInfo -> employeeInfo.getName())
//                .forEach(System.out::println);


        // Find employees whose name contains "an".

//        employees.stream().filter(employeeInfo -> employeeInfo.getName().toLowerCase().contains("ch"))
//                .map(EmployeeInfo::getName)
//                .forEach(System.out::println);


        // Find employees whose salary is between 50,000 and 100,000.


        // Need help for this
//        employees.stream().filter(employeeInfo -> employeeInfo.getSalary()<= 10000 || employeeInfo.getSalary()>=50000)
//                .forEach((employeeInfo -> {
//                    System.out.println(employeeInfo.getName() +  " " + employeeInfo.getSalary());
//                }));
//



//        Get names of employees from the "IT" department.


//        employees.stream().filter(employeeInfo -> employeeInfo.getDepartment().equals("IT"))
//                .map(EmployeeInfo::getName)
//                .forEach(System.out::println);


        // Get names of employees whose salary is greater than 80,000.

//        employees.stream().filter(employeeInfo -> employeeInfo.getSalary()>80000).map(EmployeeInfo::getName)
//                .forEach(System.out::println);


        // Find the oldest employee.
//
//        EmployeeInfo oldestEmp = employees.stream().max(Comparator.comparing(EmployeeInfo::getAge)).get();
//
//        System.out.println(oldestEmp.getName() + " " + oldestEmp.getAge());
//
//
//   Find the youngest employee.
//        EmployeeInfo youngestEmp = employees.stream().min(Comparator.comparing(EmployeeInfo::getAge)).get();
//
//        System.out.println(youngestEmp.getName() + " " + youngestEmp.getAge());


        // Find the employee with the longest name.

//        EmployeeInfo emp = employees.stream().max(Comparator.comparing(employeeInfo -> employeeInfo.getName().length())).get();
//        System.out.println(emp.getName());


        // Find the employee with the shortest name.

        EmployeeInfo shortestName  = employees.stream().min(Comparator.comparing(employeeInfo -> employeeInfo.getName().length())).get();


//        System.out.println(shortestName.getName());


        // Check whether any employee belongs to the "HR" department.

        Optional<EmployeeInfo> any = employees.stream().filter(employeeInfo -> employeeInfo.getDepartment().equals("TR"))
                .findAny();

//        System.out.println(any.isPresent());


        // Check whether all employees have a salary greater than 30,000.

        boolean b = employees.stream().allMatch(employeeInfo -> employeeInfo.getSalary() > 3000000);
        System.out.println(b);


        List<Integer> list1 = List.of(1,4,5,2,7,9);
        List<Integer> list2 = List.of(8,11,3);

        List<Integer> list =   Stream.concat(list1.stream(),list2.stream()).sorted().toList();

        System.out.println(list);




    }
}
