package com.xworkz.sunday;

public class District {
    String districtName;
    Ward[] wards;

    public District(String districtName, Ward[] wards) {
        this.districtName = districtName;
        this.wards = wards;
    }

    public void display() {
        if (wards!=null){
            System.out.println("District Name: " + districtName);
            for (Ward ward : wards) ward.display();
        }
        else System.out.println("ward is null");

    }
}
