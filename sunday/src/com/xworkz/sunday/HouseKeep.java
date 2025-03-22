package com.xworkz.sunday;

public class HouseKeep {
    String name;
    Transport transport;
    public HouseKeep(String name,Transport transport){
        this.name=name;
        this.transport=transport;
    }
    public void display(){
        System.out.println("HouseKeeper Name: " + name);
        transport.display();
    }
}
