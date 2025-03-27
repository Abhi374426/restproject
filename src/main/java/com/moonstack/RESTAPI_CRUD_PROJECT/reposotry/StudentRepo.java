package com.moonstack.RESTAPI_CRUD_PROJECT.reposotry;

import com.moonstack.RESTAPI_CRUD_PROJECT.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface StudentRepo extends JpaRepository<Student,Integer> {

    public Student  findByrollnumber(int rollnumber);
//    @Modifying
    @Transactional
    @Query("delete from Student s where s.rollnumber= :rollnumber")
    public void  deleteByrollnumber(@Param("rollnumber") int rollnumber);
}
