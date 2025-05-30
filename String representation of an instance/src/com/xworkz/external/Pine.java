package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Pine extends Plant {
    private String name;
    private String type;
    private String location;
    public Pine(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Pine{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 459632;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            if (obj instanceof Pine){
                Pine pine=this;
                Pine pine1=(Pine) obj;
                if (pine1.location.equals(pine.location) && pine1.type.equals(pine.type) && pine1.name.equals(pine.name)){
                    return  true;
                }
            }
        }
        return false;
    }
}
