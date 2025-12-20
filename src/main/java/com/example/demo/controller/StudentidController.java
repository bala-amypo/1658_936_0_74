

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.StudentidService;
import com.example.demo.entity.StudentidEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class StudentidController{
@Autowired StudentidService ser;
@PostMapping("/Idpost")

public StudentidEntity IdData(@RequestBody StudentidEntity stu){
    return ser.PostData(stu);
}

}