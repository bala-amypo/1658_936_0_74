package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import jakarta.validation.Valid;



@RestController
public class ValidationController{
@Autowired ValidationService ser;
@PostMapping("/validpost")

public ValidationEntity sendData(@Valid @RequestBody ValidationEntity stu){
    return ser.PostData(stu);
}
@PutMapping("/putid/{id}")
public StudentEntity putval(@PathVariable int id,@RequestBody StudentEntity entity){
    return ser.updateData(id,entity);
}
}