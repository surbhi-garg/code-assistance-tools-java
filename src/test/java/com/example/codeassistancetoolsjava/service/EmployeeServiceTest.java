package com.example.codeassistancetoolsjava.service;

import com.example.codeassistancetoolsjava.copilot.domain.Employee;
import com.example.codeassistancetoolsjava.copilot.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeServiceTest {
    @InjectMocks
    EmployeeService employeeService;

  //add a test for addEmployee method of employeeService
    @Test
    void addEmployee() {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setName("John");
        employee.setAge(25);
        employee.setDepartment("IT");
        employee.setDesignation("Software Engineer");
        employee.setSalary(50000);
        employeeService.addEmployee(employee);
        assertEquals(1, employeeService.getEmployeeList().size());
    }

    //add a test for removeEmployee method of employeeService
    @Test
    void removeEmployee() {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setName("John");
        employee.setAge(25);
        employee.setDepartment("IT");
        employee.setDesignation("Software Engineer");
        employee.setSalary(50000);
        employeeService.addEmployee(employee);
        employeeService.removeEmployee(employee);
        assertEquals(0, employeeService.getEmployeeList().size());
    }


}