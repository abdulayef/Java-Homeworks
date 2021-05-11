package com.company.Managers;

import com.company.entities.Student;
import com.company.entities.User;

public class StudentManager extends UserManager {

    Student student;

    public StudentManager(Student student) {
        this.student=student;
    }

    public void completeLessons(){
        System.out.println(student.getFullName()+" İsimli öğrenci dersi izledi");

    }
}
