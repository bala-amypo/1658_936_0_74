package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentidService;
import com.example.demo.entity.StudentidEntity;
import com.example.demo.repository.StudentidRepo;

@Service
public class StudentidServiceImpl implements StudentidService{
    @Autowired StudentidRepo student;
    @Override
public StudentidEntity PostData(StudentidEntity da){
return student.save(da);
}

}