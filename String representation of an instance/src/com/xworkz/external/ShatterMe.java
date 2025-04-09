package com.xworkz.external;

import com.xworkz.internal.Book;

public class ShatterMe extends Book {
    private String name;
    private String genre;
    private  int ratings;
    public ShatterMe(String name,String genre,int ratings){
        this.name=name;
        this.genre=genre;
        this.ratings=ratings;
    }

    @Override
    public String toString() {
        return "ShatterMe{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
