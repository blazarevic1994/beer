package com.example.beer.model;



import java.io.Serializable;


public class BoilVolume implements Serializable {
    private Float value;
    private String unit;

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "BoilVolume{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}
