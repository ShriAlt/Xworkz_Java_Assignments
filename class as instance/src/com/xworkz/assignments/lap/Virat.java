package com.xworkz.assignments.lap;

import com.xworkz.assignments.Clip;
import com.xworkz.assignments.bag.Cricket;
import com.xworkz.assignments.bag.Ticket;

public class Virat {
    Brush brush;
    Clip clip =null;
    Cricket cricket;
    Ticket ticket;
    public Virat(Brush brush,Clip clip,Cricket cricket,Ticket ticket){
        this.brush=brush;
        this.clip=null;
        this.cricket=cricket;
        this.ticket=ticket;
    }
    public void play(){
        if (cricket!=null){
           cricket.watch();
           cricket.profit();
        }
        else System.err.println("criket is null");

    }
    public void clean(){
        if (brush!=null){
            brush.clean();
            brush.color();
            brush.scurb();
        }
        else System.out.println("brush is null");

    }
    public void relax(){
        if (clip!=null){
            clip.hold();
        }
        else System.err.println("clip is null");

    }
}
