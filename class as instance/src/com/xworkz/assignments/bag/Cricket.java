package com.xworkz.assignments.bag;

public class Cricket {
    Ticket ticket;
    public Cricket(Ticket ticket){
        this.ticket=ticket;
    }
   public void watch(){

        if(ticket!=null){
            System.out.println("running in watch");
            ticket.buy();
            ticket.type(TicketType.EARLYBIRD);
        }
        else System.out.print("ticket is null");
    }
   public void profit(){
        if (ticket!=null){
            System.out.println("running in profit");
            ticket.sell();
        }
        else System.out.println("ticket is null");
    }

}
