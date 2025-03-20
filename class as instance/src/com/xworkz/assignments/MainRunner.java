package com.xworkz.assignments;

import com.xworkz.assignments.bag.Cricket;
import com.xworkz.assignments.bag.Ticket;
import com.xworkz.assignments.lap.Brush;
import com.xworkz.assignments.lap.Virat;

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


        Ticket ticket=new Ticket();
        Cricket cricket=new Cricket(ticket);
        cricket.profit();
        cricket.watch();

        Brush brush=new Brush();
        brush.scurb();
        brush.color();
        brush.clean();

        Virat virat=new Virat(brush,clip,cricket,ticket);
        virat.clean();
        virat.play();
        virat.relax();

    }
}
