package com.xworkz.enums;

public class FanRunner  {
    public static void main(String[] args) {
        Fan fan=new Fan();
        fan.run();
        fan.displaycat(CatType.BRITESH_FOLD);
        for (CatType catType:CatType.values()){
            System.out.println(catType);
        }

    }

}
