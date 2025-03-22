package com.xworkz.sunday;

public class District {
    String districtName;
    Ward[] wards;

    public District(String districtName, Ward[] wards) {
        this.districtName = districtName;
        this.wards = wards;
    }

    public void display() {
        System.out.println("District Name: " + districtName);
        for (Ward ward : wards) ward.display();
    }
}
