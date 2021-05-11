package com.company.Managers;

import com.company.entities.Insructor;
import com.company.entities.User;

public class InsructorManager extends UserManager {

    Insructor insructor;

    public InsructorManager(Insructor insructor) {
        this.insructor=insructor;

    }

    public void addLessons(){

        System.out.println(insructor.getFullName()+" İsmli eğitmen ders ekledi");


    }
}
