package com.xworkz.Projector;

public class Remote {
// litral ,ref, const,setter
    private Battery battery;
    private String remoteName;
    public Remote(String remoteName){
        System.out.println("running constructor of remote");
        this.remoteName=remoteName;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

//    public Battery getBattery() {
//        return battery;
//    }
    public void displayRemote(){
        if (battery!=null){
            System.out.println("name :"+this.remoteName);
           this.battery.displayBattery();
        }else System.out.println("battery is null");
    }

}
