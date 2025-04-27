package com.example.Empty_payroll_app.model;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Employee {

    private int id;

    @NotNull(message = "Name cannot be null")
    @Size(min = 1, max = 50, message = "Name must be between 1 and 50 characters")
    private String name;

    @Min(value = 1000, message = "Salary must be greater than or equal to 1000")
    private double salary;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

