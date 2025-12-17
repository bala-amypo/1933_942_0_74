package com.example.demo.controller;
@RestController
public StudentController{
@Autowired
StudentService studentService;
@PostMapping("/postdata")
public Stuentity postdata(@RequestBody Stuentity student){
    return studentService.saveStudent(student);
}
}