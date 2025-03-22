package com.xworkz.sunday;

public class PersonalAssistant {
    String name;
    int experienceYears;
    public PersonalAssistant(String name,int experienceYears){
        this.name=name;
        this.experienceYears=experienceYears;
    }
    public void assistantDetails(){
        System.out.println("Assistant Details");
        System.out.println("name :"+name);
        System.out.println("experience Years :"+experienceYears);
    }
}
