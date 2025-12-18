package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Notnull;
import jakarta.validation.constraints.Size;

@Entity
public class ValidationEntity{
@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@Notnull
@Size(min=2,max=30)
    private String name;
    private String email;
    private String password;
    private int age;

}