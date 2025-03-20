package com.xworkz.assignments.bag;

public class Ticket {
    String cost;

   public void type(TicketType ticketType){
        System.out.println("running in type");
    }
   public void buy(){
        System.out.println("running in buy");
    }
   public void  sell(){
        System.out.println("running in sell");
    }
}
