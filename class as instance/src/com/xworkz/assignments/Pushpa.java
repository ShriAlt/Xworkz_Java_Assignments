package com.xworkz.assignments;

public class Pushpa {
    Clip clip;
    Pushpa(Clip clip){
        this.clip=clip;
    }
    void useClip(Clip[] clips){
        System.out.println("running in pushpa");
        if(clip!=null){
            for (Clip clip:clips){
                clip.hold();
            }
        }
        else {
            System.err.println("clip is null");
        }

    }
}
