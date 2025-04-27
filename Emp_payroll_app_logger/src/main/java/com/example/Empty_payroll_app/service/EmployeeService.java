package com.example.Empty_payroll_app.service;

import com.example.Empty_payroll_app.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    private final List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getAllEmployee() {
        logger.info("Returning all employees. Total count: {}", employeeList.size());
        return employeeList;
    }

    public Employee addEmployee(Employee employee) {
        logger.info("Adding employee: {}", employee.getName());
        employeeList.add(employee);
        logger.info("Employee added: {}", employee.getName());
        return employee;
    }

    public double calculatePayroll() {
        double payroll = employeeList.stream().mapToDouble(Employee::getSalary).sum();
        logger.info("Total payroll calculated: {}", payroll);
        return payroll;
    }
}
