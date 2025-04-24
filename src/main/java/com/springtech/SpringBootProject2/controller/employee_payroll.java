package com.springtech.SpringBootProject2.controller;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "employee_payroll")
public class employee_payroll {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;
    private int salary;
    private Date start_date;
    private String gender;

    public employee_payroll(){

    }
    public employee_payroll(Long id, String name, int salary, Date start_date, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.start_date = start_date;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStart_date(int i) {
    }
}
