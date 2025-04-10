package com.xworkz.external;

import com.xworkz.internal.Book;

public class TwistedLove extends Book {
    private String name;
    private String genre;
    private  int ratings;
    public TwistedLove(String name,String genre,int ratings){
        this.name=name;
        this.genre=genre;
        this.ratings=ratings;
    }

    @Override
    public String toString() {
        return "TwistedLove{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", ratings=" + ratings +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 1548;
    }
}
