package com.xworkz.sunday;

public class Minister {
    PersonalAssistant personalAssistant;
    Portfolio portfolio;
    House house;
    String name;
    public Minister(String name,Portfolio portfolio,PersonalAssistant personalAssistant,House house){
        this.house=house;
        this.name=name;
        this.personalAssistant=personalAssistant;
        this.portfolio=portfolio;
    }
    public  void displayMinister(){
        System.out.println("Minister Name: " + name);
        if(personalAssistant!=null){
            personalAssistant.assistantDetails();
        }
       else System.out.println("personal assistant is null");
       if (portfolio!=null){
           portfolio.displayPortfolio();
       }
        else System.out.println("portfolio is null");
        if (house!=null) {
            house.displayHouse();
        }
        else System.out.println("house is null");
    }
}
