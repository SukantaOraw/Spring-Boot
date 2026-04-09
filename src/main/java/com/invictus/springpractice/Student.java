package com.invictus.springpractice;

public class Student {

    private String name;
    private String major;
    private Laptop laptop; 

    Student(String name, String major, Laptop laptop) {
        this.name = name;
        this.major = major;
        this.laptop = laptop;

        System.out.println(
                "Laptop object setter called in Student class : " + this.name + " " + this.major + " " + this.laptop + "\n");
   }

}
