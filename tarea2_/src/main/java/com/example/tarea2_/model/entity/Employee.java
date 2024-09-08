package com.example.tarea2_.model.entity;
import jakarta.persistence.*;


@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipper")
}
