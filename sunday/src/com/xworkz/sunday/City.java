package com.xworkz.sunday;

public class City {
    String cityName;
    Ward[] wards;

    public City(String cityName, Ward[] wards) {
        this.cityName = cityName;
        this.wards = wards;
    }

    public void display() {
        System.out.println("City Name: " + cityName);
        for (Ward ward : wards) ward.display();
    }
}
