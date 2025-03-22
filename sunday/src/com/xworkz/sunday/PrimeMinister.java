package com.xworkz.sunday;

public class PrimeMinister {
    Minister[] ministers;
    String name;
  public PrimeMinister(Minister[] ministers,String name){
        this.ministers=ministers;
        this.name=name;
    }
    public void displayPrimeMinister(){
        System.out.println("Prime Minister Name: " + name);
        for (Minister minister:ministers){
            minister.displayMinister();
        }

    }





}
