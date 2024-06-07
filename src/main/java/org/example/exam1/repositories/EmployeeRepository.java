package org.example.exam1.repositories;


import org.example.exam1.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    Employee findByEmail(String email);

   
}