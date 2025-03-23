package com.xworkz.sunday;

public class ExperienceDetail {
    String companyName;
    Education[] education;

    public ExperienceDetail(String companyName, Education[] education) {
        this.companyName = companyName;
        this.education = education;
    }

    public void display() {
        System.out.println("Company Name: " + companyName);
        if(education!=null){
            for (Education edu : education){
                edu.display();
            }
        }else System.out.println("education is null");
    }
}
