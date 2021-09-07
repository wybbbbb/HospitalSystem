package com.dgut.hospitalsystem.Bean2;

public abstract class Cost {
    String name;
    float price;
    Cost cost;

    public abstract  int getTotal();

    public void setCost(Cost cost) {
        this.cost = cost;
    }
}
