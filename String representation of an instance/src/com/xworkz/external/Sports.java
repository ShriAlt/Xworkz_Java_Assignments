package com.xworkz.external;

import com.xworkz.internal.ProductCategory;

public class Sports extends ProductCategory {
    private String name;
    private int quantity;
    private int expireDate;
    public Sports(String name,int quantity,int expireDate)
    {
        this.expireDate=expireDate;
        this.name=name;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", expireDate=" + expireDate +
                '}';
    }
}
