package com.xworkz.sunday;

public class Experience {
    int totalYears;
    ExperienceDetail[] experienceDetails;

    public Experience(int totalYears, ExperienceDetail[] experienceDetails) {
        this.totalYears = totalYears;
        this.experienceDetails = experienceDetails;
    }

    public void display() {
        System.out.println("Total Experience: " + totalYears + " years");
        for (ExperienceDetail detail : experienceDetails) detail.display();
    }
}
