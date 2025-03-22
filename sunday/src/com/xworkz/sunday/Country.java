package com.xworkz.sunday;

public class Country {
    PrimeMinister primeMinister;
    String name;
    State[] states;
    public Country(){
        this.primeMinister=primeMinister;
        this.name=name;
    }

    public void display(){
        System.out.println(" country name:"+name);
        primeMinister.displayPrimeMinister();
        for (State state:states){
            System.out.println("State :"+state);
        }



    }
}
