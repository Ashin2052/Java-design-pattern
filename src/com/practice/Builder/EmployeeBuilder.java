package com.practice.Builder;

import com.practice.model.Employee;

public class  EmployeeBuilder {

    private String name;
    private int age;
    private String department;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Employee build() {
        return new Employee(name, age, department);
    }
}
