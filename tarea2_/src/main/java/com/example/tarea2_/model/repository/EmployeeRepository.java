package com.example.tarea2_.model.repository;


import com.example.tarea2_.model.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
