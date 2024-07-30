package com.sum.employee_management.repository;

import com.sum.employee_management.entity.Employee; // Changed from 'employee' to 'Employee'
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> { // Changed from 'employeeRepository' to 'EmployeeRepository'
}
