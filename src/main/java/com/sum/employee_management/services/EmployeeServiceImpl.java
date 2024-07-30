package com.sum.employee_management.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sum.employee_management.entity.Employee;
import com.sum.employee_management.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public Employee createEmployee(Employee emp) {
        return empRepo.save(emp);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return empRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return empRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Employee Not Found"));
    }

    @Override
    public Employee updateEmployee(Long id, Employee emp) {
        Employee existing = getEmployeeById(id);
        existing.setName(emp.getName());
        existing.setDepartment(emp.getDepartment());
        existing.setRole(emp.getRole());
        existing.setSalary(emp.getSalary());

        return empRepo.save(existing);
    }

    @Override
    public void deleteEmployee(Long id) {
        empRepo.deleteById(id);
    }
}
