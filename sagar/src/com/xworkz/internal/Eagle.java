package com.xworkz.internal;

public class Eagle extends Animal{
    @Override
    public void eat() {
        System.out.println("Animal is eating...(override)");
    }
    @Override
    public void sleep() {
        System.out.println("Animal is sleeping...(override)");
    }
    @Override
    public void sound() {
        System.out.println("Animal makes a sound...(override)");
    }
    @Override
    public void run() {
        System.out.println("Animal is running...(override)");
    }
    @Override
    public void breathe() {
        System.out.println("Animal breathes oxygen...(override)");
    }
}
