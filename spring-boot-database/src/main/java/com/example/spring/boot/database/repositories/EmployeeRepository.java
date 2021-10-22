package com.example.spring.boot.database.repositories;

import com.example.spring.boot.database.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
