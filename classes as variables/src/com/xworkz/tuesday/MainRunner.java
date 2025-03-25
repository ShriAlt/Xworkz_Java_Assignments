package com.xworkz.tuesday;

public class MainRunner {
    public static void main(String[] args) {
        Alien alien=new Alien();
        Camera camera=new Camera();
        alien.seeAlien(camera);
        Satellite satellite=new Satellite();
        camera.showCamera(alien);
        System.out.println("============================ ");
        IdCard idCard=new IdCard();
        Jail jail1=new Jail();
        jail1.setJailerName("harsha");
        jail1.setLocation("banglore");
        jail1.setName("no jail");
        jail1.setTotalCells(87);
        Jail jail2=new Jail();
        jail2.setTotalCells(89);
        jail2.setName("hey");
        jail2.setLocation("manglore");
        jail2.setJailerName("ananya");
        Jail[] jails={jail1,jail2};
        idCard.showId(jails);
        System.out.println("====================");
        satellite.showSatellite();


    }
}
