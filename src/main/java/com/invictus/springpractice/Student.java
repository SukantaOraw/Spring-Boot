package com.invictus.springpractice;

import java.util.List;

public class Student {

    private List<String> subjects;

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
        System.out.println("setSubjects called in Student class with value: " + this.subjects);
    }

}
