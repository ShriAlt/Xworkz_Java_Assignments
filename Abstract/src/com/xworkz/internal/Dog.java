package com.xworkz.internal;

public class Dog extends Animal{
    // can not extend because the Animal class has no argument less constructor
    // can be achived by calling the parameterized constructor
    public Dog(){
        super("dog",1,"red");// calling the parameterised const

    }

}
