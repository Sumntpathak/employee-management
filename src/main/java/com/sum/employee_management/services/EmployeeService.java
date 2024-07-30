package com.sum.employee_management.services;
import java.util.List;
import com.sum.employee_management.entity.Employee;

public interface EmployeeService {
    Employee createEmployee(Employee Emp);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id,Employee emp);
    void deleteEmployee(Long id);
}
