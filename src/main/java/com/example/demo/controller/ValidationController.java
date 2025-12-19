package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ValidationController{
@Autowired ValidationService ser;
@PostMapping("/validpost")

public ValidationEntity sendData(@Valid @RequestBody ValidationEntity stu){
    return ser.PostData(stu);
}
@GetMapping("/gettid/{id}")
public ValidationEntity getdata(@PathVariable Long id){
    return ser.getData(id);
}
}