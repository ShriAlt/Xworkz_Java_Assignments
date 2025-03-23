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
        if (rooms!=null){
            for (Room room:rooms){
                room.display();
        }

        }else System.out.println("rooms is null");
        if (houseKeeps!=null){
            for (HouseKeep houseKeep:houseKeeps){
                houseKeep.display();
            }
        }else System.out.println("house keep is null");

    }
}
