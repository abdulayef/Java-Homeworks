package com.company.Managers;

import com.company.entities.User;

public class UserManager {

    public void add(User user) {
        System.out.println(user.getFullName()+" İsimli kullanıcı eklendi");
    }

    public void add(User[] users) {
        for (User user : users) {

            add(user);
        }
    }

}
