package com.xworkz.Projector;

public class Battery {
    private Voltage voltage;
    static final String companyName="LUMINOUS";

    public Battery(Voltage voltage){
        this.voltage=voltage;

    }
    public void displayBattery(){
        if (voltage !=null){
            voltage.setVoltage(67);
            voltage.setWatt(67);
            System.out.println("Voltage:"+voltage.getVoltage());
            System.out.println("watt:"+voltage.getWatt());
            System.out.println("Company Name:"+companyName);
        }
        else System.out.println(" voltage is null");

    }
}
