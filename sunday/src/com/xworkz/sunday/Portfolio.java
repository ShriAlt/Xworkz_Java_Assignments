package com.xworkz.sunday;

public class Portfolio {
    Detail[] details;
    int budget;
    String title;
    public Portfolio(Detail[] details,int budget,String title){
        this.details=details;
        this.title=title;
        this.budget=budget;

    }
    public void displayPortfolio(){
        System.out.println("Portfolio Title: " + title + ", Budget: " + budget);
        if (details!=null){
            for (Detail detail : details){
                detail.detailsDisplay();
        }

    }
        else System.err.println("details is null");

    }

}
