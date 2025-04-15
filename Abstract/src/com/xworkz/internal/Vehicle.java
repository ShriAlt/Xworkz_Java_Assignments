package com.xworkz.internal;

public abstract class Vehicle {
    String brand;
    String model;
    int year;
    String color;


    public Vehicle(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }


    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    public  Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

}

