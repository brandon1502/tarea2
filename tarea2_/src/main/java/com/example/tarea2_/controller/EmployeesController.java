package com.example.tarea2_.controller;

import com.example.tarea2_.model.repository.EmployeeRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employee")
public class EmployeesController {

    final EmployeeRepository employeeRepository;

    public EmployeesController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    
}
