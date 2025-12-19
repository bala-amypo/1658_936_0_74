package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentidService;
import com.example.demo.entity.StudentidEntity;
import com.example.demo.repository.StudentidRepository;

@Service
public class StudentidServiceImpl implements StudentidService{
    @Autowired StudentidRepository student;
    @Override
public StudentidEntity PostData(StudentidEntity en){
return student.save(en);
}

}