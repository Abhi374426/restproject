package com.moonstack.RESTAPI_CRUD_PROJECT.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private  int rollnumber;
    private  float marks;
    private  String university;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public float getMarks() {
        return marks;
    }

    public String getUniversity() {
        return university;
    }
}
