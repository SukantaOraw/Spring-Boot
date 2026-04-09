package com.invictus.springpractice;

public class Laptop {

    private String brand;

    Laptop(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        System.out.println("Laptop Brand getter called in Laptop class");
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Laptop Brand setter called in Laptop class with value: " + brand );
        this.brand = brand;
    }
    
}
