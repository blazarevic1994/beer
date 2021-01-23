package com.example.beer.model;


import java.io.Serializable;


public class Hop implements Serializable {
    private String name;
    private Amount amount;
    private String add;
    private String attribute;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "Hop{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", add='" + add + '\'' +
                ", attribute='" + attribute + '\'' +
                '}';
    }
}
