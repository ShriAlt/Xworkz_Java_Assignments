package com.xworkz.external;

import com.xworkz.internal.ProductCategory;

public class Electronics extends ProductCategory {
    private String name;
    private int quantity;
    private int expireDate;
    public Electronics(String name,int quantity,int expireDate)
    {
        this.expireDate=expireDate;
        this.name=name;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", expireDate=" + expireDate +
                '}';
    }
}
