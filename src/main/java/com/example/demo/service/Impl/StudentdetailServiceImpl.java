package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentdetailService;
import com.example.demo.entity.StudentdetailEntity;
import com.example.demo.repository.StudentdetailRepo;

@Service
public class StudentdetailServiceImpl implements StudentdetailService{
    @Autowired StudentdetailRepo student;
    @Override
public StudentdetailEntity PostData(StudentdetailEntity de){
return student.save(de);
}

}