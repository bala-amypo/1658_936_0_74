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
@Size(min=2,max=10,message ="must be 2 to 10 character")
    private String name;
    @Email(message="Email is not valid")
    private String email;
@Max(6)
@Notnull(message="Password is mandatory")
    private String password;
    private int age;

}