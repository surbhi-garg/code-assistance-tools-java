package com.example.codeassistancetoolsjava.copilot.controller;

import com.example.codeassistancetoolsjava.copilot.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.codeassistancetoolsjava.copilot.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
    public String addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
        return "Employee added successfully";
    }

    @GetMapping("/list")
    public List<Employee> getEmployeeList() {
        return employeeService.getEmployeeList();
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable String id) {
        return employeeService.findEmployeeById(id);
    }
}
