package a17062026;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
