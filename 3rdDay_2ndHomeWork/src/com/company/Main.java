package com.company;

import com.company.Managers.InsructorManager;
import com.company.Managers.StudentManager;
import com.company.Managers.UserManager;
import com.company.entities.Insructor;
import com.company.entities.Student;
import com.company.entities.User;

public class Main {

    public static void main(String[] args) {

        User birol = new Student();
        birol.setId(1);
        birol.setFirstName("Birol");
        birol.setSurName("ÖZTÜRK");
        birol.seteMail("1olozturk09@gmail.com");
        birol.setPassword("BRLVJSDH3N2");

        Insructor engin = new Insructor();
        engin.setId(2);
        engin.setFirstName("Engin");
        engin.setSurName("DEMİROĞ");
        engin.seteMail("engindemirog@gmail.com");
        engin.setPassword("ENGNDMRG5FDS");

        User[] users = new User[]{birol, engin};

        StudentManager studentManager=new StudentManager();
        InsructorManager insructorManager=new InsructorManager();
        UserManager userManager=new UserManager();

        userManager.add(users);
        insructorManager.addLessons(engin);
        studentManager.completeLessons((Student) birol);

    }
}
