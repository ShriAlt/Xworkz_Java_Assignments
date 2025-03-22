package com.xworkz.sunday;

public class Security {
    String securityLevel;  // e.g., High, Medium, Low
    Personnel[] personnel;

    public Security(String securityLevel, Personnel[] personnel) {
        this.securityLevel = securityLevel;
        this.personnel = personnel;
    }

    public void display() {
        System.out.println("Security Level: " + securityLevel);
        for (Personnel person : personnel) person.display();
    }
}
