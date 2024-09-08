package com.example.tarea2_.controller;


import com.example.tarea2_.model.entity.Employee;
import com.example.tarea2_.model.repository.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {

    final EmployeeRepository employeeRepository;

    public HomeController(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/listar")
    public String listarEmployees( Model model) {

        List<Employee> listaEmployees = employeeRepository.findAll();
        model.addAttribute("listaEmployees", listaEmployees);

        return"employee/lista";
    }


}