package com.example.beer.model;



import java.io.Serializable;


public class Fermentation implements Serializable {
    private Temperature temp;

    public Temperature getTemp() {
        return temp;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Fermentation{" +
                "temp=" + temp +
                '}';
    }
}
