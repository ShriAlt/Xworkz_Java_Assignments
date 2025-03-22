package com.xworkz.sunday;

public class Room {
    String roomType;
    int size;
    int floorNumber;
    boolean isOccupied;

    public Room(String roomType, int size, int floorNumber, boolean isOccupied) {
        this.roomType = roomType;
        this.size = size;
        this.floorNumber = floorNumber;
        this.isOccupied = isOccupied;
    }

    public void display() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Size: " + size + " sq. ft.");
        System.out.println("Floor Number: " + floorNumber);
        System.out.println("Occupied: " + (isOccupied ? "Yes" : "No"));
    }
}

