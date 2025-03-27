package com.moonstack.RESTAPI_CRUD_PROJECT.service;

import com.moonstack.RESTAPI_CRUD_PROJECT.entity.Student;

import java.util.List;

public interface StudentService {

    public Student   addStudentDetails(Student std);
    public List<Student> findAllStudentdetails();
    public Student  findStudentByRoll(int rollnumber);
    public  Student updateStudent(int rollnumber,float marks);
    public String  deleteStudent(Student std);
    public String deleteStudentByroll(int roll);
}
