package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.StudentRepo;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepo student;
    @Override
public StudentEntity PostData(StudentEntity stu){
return student.save(stu);
}