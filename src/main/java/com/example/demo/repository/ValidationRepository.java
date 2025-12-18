package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.example.demo.entity.ValidationRepository;
@Repository
public interface ValidationRepository extends JpaRepository<ValidationRepository,Integer>{

}