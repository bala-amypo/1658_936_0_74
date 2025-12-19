package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.TimestampService;
import com.example.demo.entity.TimestampEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class TimestampController{
@Autowired TimestampService ser;
@PostMapping("/Timepost")

public TimestampEntity TimeData(@RequestBody TimestampEntity stu){
    return ser.PostData(stu);
}

}