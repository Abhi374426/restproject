package com.moonstack.RESTAPI_CRUD_PROJECT.service;

import com.moonstack.RESTAPI_CRUD_PROJECT.entity.Student;
import com.moonstack.RESTAPI_CRUD_PROJECT.reposotry.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements  StudentService{

    private Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Autowired
     StudentRepo studentRepo;

    @Override
    public Student addStudentDetails(Student std) {
         int a=10;
        return  studentRepo.save(std) ;
    }

    @Override
    public List<Student> findAllStudentdetails() {
        return studentRepo.findAll();
    }

    @Override
    public Student findStudentByRoll(int rollnumber) {
        return studentRepo.findByrollnumber(rollnumber);
    }

    @Override
    public Student updateStudent(int rollnumber, float marks) {

          Student std=studentRepo.findByrollnumber(rollnumber);
          std.setMarks(marks);


        return studentRepo.save(std);
    }

    @Override
    public String deleteStudent(Student std) {

               try{
                   studentRepo.delete(std);
                   return "sucess";
               }
               catch (Exception e){
                   logger.error("faild bcoz : {}",e.getMessage());
                   return "faild";
               }
    }

    @Override
    public String deleteStudentByroll(int roll) {

        try {
            studentRepo.deleteByrollnumber(roll);
            return "scuess";
        }
        catch (Exception e){
            logger.error("faild bcoz : {}",e.getMessage());
            return "faild";
        }



    }
}
