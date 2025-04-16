package com.xworkz.internal;

public class ProjectManager implements Employee, Manager {
    public void grow() {
        System.out.println("ProjectManager is growing");
    }

    public void move() {
        System.out.println("ProjectManager is moving");
    }

    public void function() {
        System.out.println("ProjectManager is functioning");
    }
}