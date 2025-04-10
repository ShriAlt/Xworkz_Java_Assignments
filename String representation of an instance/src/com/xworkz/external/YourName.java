package com.xworkz.external;

import com.xworkz.internal.Book;

public class YourName extends Book {
    private String name;
    private String genre;
    private  int ratings;
    public YourName(String name,String genre,int ratings){
        this.name=name;
        this.genre=genre;
        this.ratings=ratings;
    }

    @Override
    public String toString() {
        return "YourName{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", ratings=" + ratings +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 44586;
    }
}
