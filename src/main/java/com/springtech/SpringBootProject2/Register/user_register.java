package com.springtech.SpringBootProject2.Register;

import com.springtech.SpringBootProject2.controller.employee_payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface user_register extends JpaRepository<employee_payroll,Integer>{

}
