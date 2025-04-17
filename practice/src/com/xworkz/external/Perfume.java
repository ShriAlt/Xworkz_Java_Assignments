package com.xworkz.external;

import com.xworkz.internal.Bag;
import com.xworkz.internal.Bottle;

public class Perfume extends Bottle {
     public Perfume(){
         super();
     }
     public void displayPerfume(){
        // not possible Bag bag=new Bag();
         Bottle bottle=new Bottle();

         display();
         this.display();



         }

    @Override
    protected void display() {
        super.display();
    }
}

