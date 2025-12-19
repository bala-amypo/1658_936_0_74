package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.TimestampService;
import com.example.demo.entity.TimestampEntity;
import com.example.demo.repository.TimestampRepository;

@Service
public class TimestampServiceImpl implements TimestampService{
    @Autowired TimestampRepository student;
    @Override
public TimestampEntity PostData(TimestampEntity stu){
return student.save(stu);
}

}