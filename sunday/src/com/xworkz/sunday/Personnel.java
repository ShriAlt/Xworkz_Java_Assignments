package com.xworkz.sunday;

public class Personnel {
    String name;
    Skill skill;

    public Personnel(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void display() {
        System.out.println("Personnel Name: " + name);
        if(skill!=null){
            skill.display();
        }
       else System.out.println("skill is null");
    }
}
