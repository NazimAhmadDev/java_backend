package com.example.Empty_payroll_app.service;

import com.example.Empty_payroll_app.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getAllEmployee() {
        return employeeList;
    }

    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    public double calculatePayroll() {
        return employeeList.stream().mapToDouble(Employee::getSalary).sum();
    }
}

