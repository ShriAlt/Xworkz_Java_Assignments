package com.xworkz.enums;

public enum CatType {
    PERSIAN("calm"),ORANGE("high"),BRITESH_FOLD("little");

    private String crazyness;
     CatType(String crazyness){
        this.crazyness=crazyness;
    }

    public String getCrazyness() {
        return crazyness;
    }
}
