package com.example.Empty_payroll_app.controller;

import com.example.Empty_payroll_app.model.Employee;
import com.example.Empty_payroll_app.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;



    @GetMapping
    public List<Employee> getEmployees() {
        logger.info("Fetching all employees...");
        List<Employee> employees = employeeService.getAllEmployee();
        logger.info("Fetched {} employees", employees.size());
        return employees;
    }



    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        logger.info("Received request to add a new employee: {}", employee.getName());
        Employee addedEmployee = employeeService.addEmployee(employee);
        logger.info("Employee added successfully: {}", addedEmployee.getName());
        return addedEmployee;
    }



    @GetMapping("/payroll")
    public double getPayroll() {
        logger.info("Request received to calculate payroll.");
        double totalPayroll = employeeService.calculatePayroll();
        logger.info("Total payroll calculated: {}", totalPayroll);
        return totalPayroll;
    }
}
