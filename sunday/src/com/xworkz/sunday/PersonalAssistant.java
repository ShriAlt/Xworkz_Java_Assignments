package com.xworkz.sunday;

public class PersonalAssistant {
    String name;
    int age;
    String qualification;
    long ph;
    public PersonalAssistant(String name,int age,String qualification,long ph){
        this.name=name;
        this.age=age;
        this.qualification=qualification;
        this.ph=ph;
    }
    public void assistantDetails(){
        System.out.println("Assistant Details");
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("quali :"+qualification);
        System.out.println("ph :"+ph);
    }
}
