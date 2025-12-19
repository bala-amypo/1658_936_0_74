package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentdetailService;
import com.example.demo.entity.StudentdetailEntity;
import com.example.demo.repository.StudentdetailRepository;

@Service
public class StudentdetailServiceImpl implements StudentdetailService{
    @Autowired StudentdetailRepository student;
    @Override
public StudentdetailEntity PostData(StudentdetailEntity en){
return student.save(en);
}

}