package com.xworkz.internal;

public class ComputerScience extends Subject{
    @Override
    public void study(){
        System.out.println("overriding the parent method");
    }
    @Override
    public void takeExam() {
        System.out.println("Overriding the parent method");
    }

    @Override
    public void doAssignment() {
        System.out.println("Overriding the parent method");
    }

    @Override
    public void research() {
        System.out.println("Overriding the parent method.");
    }
    @Override
    public void attendLecture() {
        System.out.println("Overriding the parent method");
    }
}
