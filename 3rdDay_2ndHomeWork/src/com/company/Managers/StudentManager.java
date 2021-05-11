package com.company.Managers;

import com.company.entities.Student;
import com.company.entities.User;

public class StudentManager extends UserManager {

    public void completeLessons(Student student){
        System.out.println(student.getFullName()+" İsimli öğrenci dersi izledi");

    }
}
