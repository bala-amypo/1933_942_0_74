package com.example.demo.Serviceimpl;

package com.example.demo.service.stereotype.Service;

import com.example.demo.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService{

private final StuRepository studentrepository;
public StudentServiceimpl(StuRepository studentrepository){
    this.studentrepository=studentrepository;
}
public Stuentity saveStudent(Stuentity student){
return studentrepository    
}
}