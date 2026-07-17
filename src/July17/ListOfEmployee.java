package July17;

import java.time.LocalDate;
import java.util.List;

public class ListOfEmployee {
    
    public static List<EmployeeInfo> getEmployeeInfos(){
        
        
        return List.of(  new EmployeeInfo(1, "John", "IT", 80000, 28, "Male",
                        LocalDate.of(2021, 3, 10), "Bangalore", true),

                new EmployeeInfo(2, "Alice", "HR", 60000, 32, "Female",
                        LocalDate.of(2020, 5, 15), "Mumbai", true),

                new EmployeeInfo(3, "Bob", "IT", 95000, 35, "Male",
                        LocalDate.of(2019, 8, 20), "Delhi", false),

                new EmployeeInfo(4, "Emma", "Finance", 70000, 29, "Female",
                        LocalDate.of(2022, 1, 5), "Bangalore", true),

                new EmployeeInfo(5, "David", "IT", 120000, 40, "Male",
                        LocalDate.of(2018, 6, 18), "Pune", true),

                new EmployeeInfo(6, "Sophia", "HR", 65000, 27, "Female",
                        LocalDate.of(2023, 2, 12), "Chennai", true),

                new EmployeeInfo(7, "Michael", "Finance", 85000, 31, "Male",
                        LocalDate.of(2021, 11, 1), "Hyderabad", false),

                new EmployeeInfo(8, "Olivia", "IT", 110000, 36, "Female",
                        LocalDate.of(2017, 4, 8), "Bangalore", true),

                new EmployeeInfo(9, "James", "Admin", 50000, 25, "Male",
                        LocalDate.of(2024, 1, 1), "Delhi", true),

                new EmployeeInfo(10, "Charlotte", "Admin", 155000, 26, "Female",
                        LocalDate.of(2023, 9, 10), "Mumbai", true)
        );
    }
}
