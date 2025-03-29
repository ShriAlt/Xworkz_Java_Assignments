package com.xworkz.another;

import com.xworkz.enums.Cat;
import com.xworkz.enums.CatType;

public class Runner
{
    public static void main(String[] args) {

        Cat cat=new Cat();
        cat.displaycat(CatType.BRITESH_FOLD);
        for (CatType catType:CatType.values()){
            System.out.println(catType);
        }
    }
}
