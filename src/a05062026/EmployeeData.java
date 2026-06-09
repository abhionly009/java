package a05062026;

import java.time.LocalDate;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        return List.of(
                new Employee(1, "John", "IT", 80000, 28, "Male",
                        LocalDate.of(2021, 3, 10), "Bangalore", true),

                new Employee(2, "Alice", "HR", 60000, 32, "Female",
                        LocalDate.of(2020, 5, 15), "Mumbai", true),

                new Employee(3, "Bob", "IT", 95000, 35, "Male",
                        LocalDate.of(2019, 8, 20), "Delhi", false),

                new Employee(4, "Emma", "Finance", 70000, 29, "Female",
                        LocalDate.of(2022, 1, 5), "Bangalore", true),

                new Employee(5, "David", "IT", 120000, 40, "Male",
                        LocalDate.of(2018, 6, 18), "Pune", true),

                new Employee(6, "Sophia", "HR", 65000, 27, "Female",
                        LocalDate.of(2023, 2, 12), "Chennai", true),

                new Employee(7, "Michael", "Finance", 85000, 31, "Male",
                        LocalDate.of(2021, 11, 1), "Hyderabad", false),

                new Employee(8, "Olivia", "IT", 110000, 36, "Female",
                        LocalDate.of(2017, 4, 8), "Bangalore", true),

                new Employee(9, "James", "Admin", 50000, 25, "Male",
                        LocalDate.of(2024, 1, 1), "Delhi", true),

                new Employee(10, "Charlotte", "Admin", 55000, 26, "Female",
                        LocalDate.of(2023, 9, 10), "Mumbai", true)
        );
    }


}
