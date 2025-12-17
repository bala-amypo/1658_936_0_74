package com.example.demo.service.Impl;
import org,springframework.stereotype.Service;

import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepo student;
StudentEntity PostData(StudentEntity stu);
}