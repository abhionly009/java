package FunctionExample;


import PredicateExample.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MainClass {
    public static void main(String[] args) {


        Employee e1 = new Employee("Abhinandan",32,false);
        Employee e2 = new Employee("Deepak", 32, true);
        Employee e3 = new Employee("Sandeep",32, false);
        Employee e4 = new Employee("Atul",15,true);
        List<Employee> employees = new ArrayList<>(Arrays.asList(e1, e2, e3, e4));


        Function<Employee, String> name = emp -> emp.getName().toUpperCase();

        Function<Integer,Integer> square = i-> i*i;

        Integer[] arr = {2,4,6,7,4,3,9,5};

        for (Integer integer : arr) {
            System.out.println(square.apply(integer));
        }

        for(Employee employee: employees){
            System.out.println(name.apply(employee));
        }


    }
}
