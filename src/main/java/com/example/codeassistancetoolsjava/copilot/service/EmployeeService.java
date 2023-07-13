package com.example.codeassistancetoolsjava.copilot.service;

import com.example.codeassistancetoolsjava.copilot.domain.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public void removeEmployeeById(String id) {
        employeeList.removeIf(employee -> employee.getId().equals(id));
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee findEmployeeById(String id) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public Employee updateEmployeeById(String id, Employee employee) {
        for (Employee employee1 : employeeList) {
            if (employee1.getId().equals(id)) {
                employee1.setName(employee.getName());
                employee1.setAge(employee.getAge());
                employee1.setDepartment(employee.getDepartment());
                employee1.setDesignation(employee.getDesignation());
                employee1.setSalary(employee.getSalary());
                return employee1;
            }
        }
        return null;
    }

}
