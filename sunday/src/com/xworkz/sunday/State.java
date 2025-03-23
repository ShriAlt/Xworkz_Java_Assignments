package com.xworkz.sunday;

public class State {
    String stateName;
    District[] districts;
    City[] cities;

    public State(String stateName, District[] districts, City[] cities) {
        this.stateName = stateName;
        this.districts = districts;
        this.cities = cities;
    }

    public void display() {
        System.out.println("State Name: " + stateName);
        if(districts!=null){
            for (District district : districts) district.display();
        }
        else System.out.println("districts are null");
    }
}
