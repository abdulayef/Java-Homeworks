package com.company.Managers;

import com.company.entities.Insructor;
import com.company.entities.User;

public class InsructorManager extends UserManager {

    public void addLessons(Insructor insructor){

        System.out.println(insructor.getFullName()+" İismli eğitmen ders ekledi");


    }
}
