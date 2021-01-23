package com.example.beer.model;



import java.io.Serializable;


public class Malt implements Serializable {
    private String name;
    private Amount amount;

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

    @Override
    public String toString() {
        return "Malt{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
