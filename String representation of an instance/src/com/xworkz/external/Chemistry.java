package com.xworkz.external;

import com.xworkz.internal.Subject;

public class Chemistry extends Subject {
    private int score;
    private String name;
    private String grade;
    public Chemistry(String name,String grade,int score){
        this.name=name;
        this.grade=grade;
        this.score=score;
    }

    @Override
    public String toString() {
        return "Chemistry{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 8574;
    }
}
