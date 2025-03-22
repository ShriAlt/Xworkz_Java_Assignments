package com.xworkz.sunday;

public class Education {
    String degree;
    String university;

    public Education(String degree, String university) {
        this.degree = degree;
        this.university = university;
    }

    public void display() {
        System.out.println("Degree: " + degree + ", University: " + university);
    }
}
