package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
public StudentController{
@Autowired
StudentService studentService;
@PostMapping("/postdata")
public Stuentity postdata(@RequestBody Stuentity student){
    return studentService.saveStudent(student);
}
}