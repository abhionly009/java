package streamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEmployeeWithDepartment {


    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("abhinandan",33,10,40.5,"SOFTWARE"));
        employees.add(new Employee("kunal",23,4,25,"IT"));
        employees.add(new Employee("Sima",34,9,15,"HR"));
        employees.add(new Employee("Harshit",30,7,40,"SOFTWARE"));
        employees.add(new Employee("Raushan",32,8,29,"IT"));


        Map<String, List<Employee>> collect = employees.stream()
                .filter((emp)->emp.getAnnualSalary()>25)
                .collect(Collectors.groupingBy(Employee::getDept));

        System.out.println(collect);


    }
}
