package com.example.spring.boot.database.controller;

import com.example.spring.boot.database.entities.Employee;
import com.example.spring.boot.database.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/employees")
    public List<Employee> getEmployee(){
        return this.repository.findAll();
    }
}
