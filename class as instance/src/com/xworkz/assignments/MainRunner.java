package com.xworkz.assignments;

public class MainRunner {
    public static void main(String[] args) {
        Clip clip=new Clip();
        Pushpa pushpa=new Pushpa(clip);
        Clip clip1=new Clip();
        Clip clip2=new Clip();
        Clip clip3=new Clip();
        Clip clip4=new Clip();
        Clip clip5=new Clip();
        Clip[] clips={clip1,clip2,clip3,clip4,clip5,clip};
        pushpa.useClip(clips);

    }
}
