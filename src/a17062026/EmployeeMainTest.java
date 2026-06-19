package a17062026;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeMainTest {

    EmployeeMain employeeMain;
    EmployeeUtils employeeUtils;

    @BeforeEach
    void setup(){
        employeeMain = new EmployeeMain();
        employeeUtils = new EmployeeUtils();
    }

    @Test
    void testEmployeeSalaryGreaterThan80000(){
       Stream<String> data = employeeMain.findListOfEmployeesWhoseSalaryIsGreaterThan80000(employeeUtils.getEmployees());
       assertEquals(4,data.count());
    }

    @Test
    void testHighestEarningEmployee(){
        Optional<Employee> highestPayingEmployee = employeeMain.findHighestPayingEmployee(employeeUtils.getEmployees());

        assertEquals("David",highestPayingEmployee.get().getName());
        assertEquals(120000.0,highestPayingEmployee.get().getSalary());
        assertEquals("IT",highestPayingEmployee.get().getDepartment());
        assertEquals("Pune",highestPayingEmployee.get().getCity());
        assertEquals("Male",highestPayingEmployee.get().getGender());
        assertEquals(true,highestPayingEmployee.get().isActive());
        assertEquals(5,highestPayingEmployee.get().getId());
    }


    @Test
    void testHighestEarningEmployeeWhenListIsNull(){
      NullPointerException exception =  assertThrows(NullPointerException.class, ()->employeeMain.findHighestPayingEmployee(null));
      assertEquals("Employee list is null",exception.getMessage());
    }

}
