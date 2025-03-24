package com.xworkz.monday;

public class Library {
    private int totalBooks=100;
    public String location;
    String librarianName;
    private void displayPrivate(){
        System.out.println("displaying private method"+librarianName);
    }
    public void display(){
        System.out.println("totalbooks(private variable)"+totalBooks);
        displayPrivate();
    }
    void displayLocation(){
        System.out.println("location(public variable)"+location);
    }

}
