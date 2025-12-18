package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StuEntity;
import com.example.demo.repository.StuRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StuRepository studentrepository;

    @Override
    public StuEntity saveStudent(StuEntity student) {
        return studentrepository.save(student);
    }
}
