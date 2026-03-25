package com.invictus.springpractice;

public class Student {
    
    private String name;
    private String major;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name setter called");
        this.name = name;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        System.out.println("Major setter called");
        this.major = major;
    }

    
}
