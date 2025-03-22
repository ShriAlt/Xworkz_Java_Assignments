package com.xworkz.sunday;

public class House {
    Room[] rooms;
    HouseKeep[] houseKeeps;
    String address;
    public House(Room[] rooms ,HouseKeep[] houseKeeps,String address){
        this.rooms=rooms;
        this.address=address;
        this.houseKeeps=houseKeeps;
    }
    public void displayHouse(){
        System.out.println("Address"+address);
        for (Room room:rooms){
            room.display();
        }
        for (HouseKeep houseKeep:houseKeeps){
            houseKeep.display();
        }
    }
}
