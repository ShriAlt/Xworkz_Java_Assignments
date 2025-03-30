package com.xworkz.enums;

public class Cat {
 public void displaycat (CatType catType){
     System.out.println("running cat  type");
     System.out.println("cat:"+CatType.BRITESH_FOLD);
     System.out.println("pr0perty:"+CatType.BRITESH_FOLD.getCrazyness());
     System.out.println("cat:"+CatType.ORANGE);
     System.out.println(CatType.ORANGE.getCrazyness());
 }
}
