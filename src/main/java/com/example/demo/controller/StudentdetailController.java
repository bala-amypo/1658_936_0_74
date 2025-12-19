package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.StudentdetailService;
import com.example.demo.entity.StudentdetailEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class StudentdetailController{
@Autowired StudentdetailService ser;
@PostMapping("/Detailpost")

public StudentdetailEntity DetailData(@RequestBody StudentdetailEntity stu){
    return ser.PostData(stu);
}

}