package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import 
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class ValidationController{
@Autowired StudentService ser;
@PostMapping("/post")

public ValidationEntity sendData(@Valid @RequestBody ValidationEntity stu){
    return ser.PostData(stu);
}