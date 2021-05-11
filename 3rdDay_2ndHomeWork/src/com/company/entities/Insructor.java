package com.company.entities;

import com.company.entities.User;

public class Insructor extends User {

    String insructorID;
    int number_Of_Students;

    public Insructor() {
    }

    public String getInsructorID() {
        return insructorID;
    }

    public void setInsructorID(String insructorID) {
        this.insructorID = insructorID;
    }

    public int getNumber_Of_Students() {
        return number_Of_Students;
    }

    public void setNumber_Of_Students(int number_Of_Students) {
        this.number_Of_Students = number_Of_Students;
    }
}
