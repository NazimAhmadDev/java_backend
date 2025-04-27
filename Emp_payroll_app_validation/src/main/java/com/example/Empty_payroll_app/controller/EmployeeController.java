package com.example.Empty_payroll_app.controller;



import com.example.Empty_payroll_app.model.Employee;
import com.example.Empty_payroll_app.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public Employee addEmployee(@Valid @RequestBody Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            throw new IllegalArgumentException("Invalid employee data");
        }
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/payroll")
    public double getPayroll() {
        return employeeService.calculatePayroll();
    }
}
