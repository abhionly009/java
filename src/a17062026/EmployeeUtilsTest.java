package a17062026;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeUtilsTest {

    EmployeeUtils employeeUtils ;

    @BeforeEach
    void setUp(){
        employeeUtils = new EmployeeUtils();
    }

    @Test
    void testWhenCalledGetMethodShouldReturnListOfEmployee(){
        List<Employee> employees = employeeUtils.getEmployees();
        assertEquals(10,employees.size());
        assertEquals("John",employees.get(0).getName());
        assertEquals("Sophia",employees.get(5).getName());

    }
}
