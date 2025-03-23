package com.xworkz.sunday;

public class Skill {
    String skillName;
    Experience experience;

    public Skill(String skillName, Experience experience) {
        this.skillName = skillName;
        this.experience = experience;
    }

    public void display() {
        System.out.println("Skill Name: " + skillName);
        if (experience!=null){
            experience.display();
        }
        else System.out.println("experience is null");
    }
}
