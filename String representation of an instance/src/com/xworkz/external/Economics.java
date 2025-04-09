package com.xworkz.external;

import com.xworkz.internal.Subject;

public class Economics extends Subject {
    private int score;
    private String name;
    private String grade;
    public Economics(String name,String grade,int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "Economics{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
