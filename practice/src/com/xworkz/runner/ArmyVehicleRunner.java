package com.xworkz.runner;

import com.xworkz.internal.ArmyVehicle;
import com.xworkz.internal.MrfTyre;
import com.xworkz.internal.Rubber;
import com.xworkz.internal.Tyre;

public class ArmyVehicleRunner {
    public static void main(String[] args) {
        ArmyVehicle armyVehicle=new ArmyVehicle();
        Rubber rubber = new Rubber();
        armyVehicle.display(rubber);
        Tyre tyre = new Tyre();
        tyre.expands();
        tyre.compress();

        
        Rubber rubber1 = new Tyre();
        rubber1.expands();
//        rubber1.compress();



        armyVehicle.display(tyre);
        armyVehicle.display(rubber1);
        MrfTyre mrfTyre = new MrfTyre();
        armyVehicle.display(mrfTyre);
        tyre.expands();
        rubber1.expands();
        rubber.expands();
        mrfTyre.expands();

    }
}
