package com.example.codeassistancetoolsjava.copilot.domain;

public class Employee {
    String name;
    int age;
    String department;
    String designation;
    double salary;

    String id;

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Employee setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getDesignation() {
        return designation;
    }

    public Employee setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public String getId() {
        return id;
    }

    public Employee setId(String id) {
        this.id = id;
        return this;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }
}
