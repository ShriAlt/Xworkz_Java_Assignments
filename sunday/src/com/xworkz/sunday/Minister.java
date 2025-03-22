package com.xworkz.sunday;

public class Minister {
    PersonalAssistant personalAssistant;
    Portfolio portfolio;
    House house;
    String name;
    public Minister(Portfolio portfolio,PersonalAssistant personalAssistant,House house){
        this.house=house;
        this.personalAssistant=personalAssistant;
        this.portfolio=portfolio;
    }
    public  void displayMinister(){
        System.out.println("Minister Name: " + name);
        personalAssistant.assistantDetails();
        portfolio.displayPortfolio();
        house.displayHouse();
    }
}
