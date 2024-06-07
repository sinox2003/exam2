package org.example.exam1.services;

import org.example.exam1.entities.Employee;
import org.example.exam1.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private  EmployeeRepository employeeRepository;



    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findByEmail(String email) {
        return Optional.ofNullable(employeeRepository.findByEmail(email));
    }
}
