package com.moonstack.RESTAPI_CRUD_PROJECT.controller;

import com.moonstack.RESTAPI_CRUD_PROJECT.entity.Student;
import com.moonstack.RESTAPI_CRUD_PROJECT.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public Student addStudentDetails(@RequestBody Student std){
     return  studentService.addStudentDetails(std);
    }
    @GetMapping("/student")
    public List<Student> findAllStudentDetails(){
         return studentService.findAllStudentdetails();
    }
    @GetMapping("/student/{rollnumber}")
    public Student findStudentByRoll(@PathVariable int rollnumber){
           return studentService.findStudentByRoll(rollnumber);
    }
    @PutMapping("/student/{rollnumber}/{marks}")
    public Student updateStudent(@PathVariable int rollnumber,@PathVariable float marks){
        return studentService.updateStudent(rollnumber,marks);
    }
    @DeleteMapping("/student")
    public String deletedStudent(@RequestBody Student std){
        return studentService.deleteStudent(std);
    }
    @DeleteMapping("/student/{rollnumber}")
    public String  deletedStudentByroll(@PathVariable int rollnumber){
         return studentService.deleteStudentByroll(rollnumber);
    }


}
