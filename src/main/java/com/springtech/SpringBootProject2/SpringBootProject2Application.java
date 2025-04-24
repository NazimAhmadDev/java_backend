package com.springtech.SpringBootProject2;

import com.springtech.SpringBootProject2.Register.user_register;
import com.springtech.SpringBootProject2.controller.employee_payroll;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBootProject2Application {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(SpringBootProject2Application.class, args);

		user_register userregister = context.getBean(user_register.class);

		employee_payroll emp = new employee_payroll();

		emp.setId(104L);
		emp.setName("Vansh");
		emp.setSalary(1500000);
		emp.setStart_date(2025-01-01);
		emp.setGender("M");

		employee_payroll emp2 = userregister.save(emp);
		System.out.println(emp2);
	}

}
