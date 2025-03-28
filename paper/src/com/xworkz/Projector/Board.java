package com.xworkz.Projector;

public class Board {
    static final String boardType="Bread Board";
    private Capacitor capacitor;

    public  Board(Capacitor capacitor)
    {
        this.capacitor=capacitor;

    }
    public void displayBoard()
    {
        if(capacitor!=null){
            capacitor.setCapacitorPrice(10);
            capacitor.setCapacitorType("Storage");
            System.out.println("Board Company: "+boardType);
            System.out.println("Capacitor Price: "+capacitor.getCapacitorPrice());
            System.out.println("Capacitor TYpe: "+capacitor.getCapacitorType());
        }
    }
}
