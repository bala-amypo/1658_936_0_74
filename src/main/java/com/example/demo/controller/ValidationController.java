package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import org.springframework.web.bind.annotation.Valid;
import java.util.List;


@RestController
public class ValidationController{
@Autowired ValidationService ser;
@PostMapping("/Validpost")

public ValidationEntity Postval(@Valid @RequestBody ValidationEntity stu){
    return ser.PostData(stu);
}
}