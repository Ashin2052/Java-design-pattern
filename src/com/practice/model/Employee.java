package com.practice.model;

import com.practice.Builder.EmployeeBuilder;

public class Employee  {
    private final String name;
    private final int age;
    private final String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
}
