package com.xworkz.external;

import com.xworkz.internal.Subject;

public class English extends Subject {
    private int score;
    private String name;
    private String grade;
    public English(String name,String grade,int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "English{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
