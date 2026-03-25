package com.invictus.springpractice;

public class Student {

    private String name;
    private String major;
    private Laptop laptop; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name setter called with value: " + name );
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        System.out.println("Major setter called with value: " + major);
        this.major = major;
    }

    // Setter for Laptop object, used by Spring for injection
    public void setLaptop(Laptop laptop) {
        System.out.println("Laptop object setter called in Student class");
        this.laptop = laptop;
    }

    public Laptop getLaptop() { 
        return laptop;
    }

}
