package com.xworkz.enums;

public class Fan extends Cat {
public void run(){
    System.out.println("running fan in fan");
    super.displaycat(CatType.BRITESH_FOLD);
    super.setName("harsha");
    System.out.println(super.getName());


}
 public void displaycat(){
    System.out.println("overridden");
}
}
