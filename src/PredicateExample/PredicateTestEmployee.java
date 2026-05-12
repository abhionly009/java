package PredicateExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTestEmployee {

    public static void main(String[] args) {


        Employee e1 = new Employee("Abhinandan",32,false);
        Employee e2 = new Employee("Deepak", 32, true);
        Employee e3 = new Employee("Sandeep",32, false);
        Employee e4 = new Employee("Atul",15,true);
        List<Employee> employees = new ArrayList<>(Arrays.asList(e1, e2, e3, e4));


        Predicate<Employee> p1 = e->e.getAge()>25 && e.isHavingGf();

        employees.forEach(employee -> System.out.println(p1.test(employee)));
    }
}
