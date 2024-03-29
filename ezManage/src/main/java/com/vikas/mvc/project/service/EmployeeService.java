package com.vikas.mvc.project.service;

import com.vikas.mvc.project.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAllEmployees();

    Optional<Employee> findEmployeeByUsername(String username);

    @Transactional
    void saveEmployee(Employee employee);

    @Transactional
    void deleteEmployeeByUsername(String username);

    List<Employee> findAllByOrderByFirstNameAsc();
    List<Employee> findAllByOrderByFirstNameDesc();

    List<Employee> findAllByOrderByLastNameAsc();
    List<Employee> findAllByOrderByLastNameDesc();

    public List<Employee> findAllByOrderByEmailAsc();
    public List<Employee> findAllByOrderByEmailDesc();

    public List<Employee> findAllByOrderByRoleAsc();
    public List<Employee> findAllByOrderByRoleDesc();
}
