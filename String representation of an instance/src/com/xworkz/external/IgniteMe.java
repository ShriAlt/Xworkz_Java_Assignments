package com.xworkz.external;

import com.xworkz.internal.Book;

public class IgniteMe extends Book {
    private String name;
    private String genre;
    private  int ratings;
    public IgniteMe(String name,String genre,int ratings){
        this.name=name;
        this.genre=genre;
        this.ratings=ratings;
    }

    @Override
    public String toString() {
        return "IgniteMe{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
