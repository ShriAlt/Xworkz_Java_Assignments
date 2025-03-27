package com.xworkz.Projector;

public class Projector {
    private Remote remote;

    public void displayProjector(){
        System.out.println("running display projector");

        Voltage voltage=new Voltage();
        Battery battery=new Battery(voltage);
            Remote remote=new Remote("LG");
            remote.setBattery(battery);
            remote.displayRemote();


    }
}
