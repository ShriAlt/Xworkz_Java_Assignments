package com.xworkz.internal;

public class Dove extends Shampoo{
    @Override
    public  void displayShampoo(){
        System.out.println("abstract method");
    }
    void smell(){
        super.apply();
    }
}
