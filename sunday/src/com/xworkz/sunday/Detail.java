package com.xworkz.sunday;

public class Detail {
    String name;
    String responsibility;
    int duration;
    String status;

    public Detail(String name, String responsibility, int duration, String status) {
        this.name = name;
        this.responsibility = responsibility;
        this.duration = duration;
        this.status = status;
    }

    public void detailsDisplay() {
        System.out.println("Detail Name: " + name);
        System.out.println("Responsibility: " + responsibility);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Status: " + status);
    }
}
