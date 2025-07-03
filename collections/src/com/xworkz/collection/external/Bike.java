package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.Collection;

public class Bike {


  public   void run(){
        Collection<BikeDTO> bikeDTOCollection=new ArrayList<>();

        Collection<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);

        for(Integer i : nums){
            System.out.println("nums"+nums);
        }


    }
}
