package com.employees.employeemanager.repository;

import com.employees.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    // in case that employee does not exist
    Optional<Employee> findEmployeeById(Long id);
}
