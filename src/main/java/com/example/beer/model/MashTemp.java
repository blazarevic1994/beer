package com.example.beer.model;



import java.io.Serializable;


public class MashTemp implements Serializable {
    private Temperature temp;
    private Float duration;

    public Temperature getTemp() {
        return temp;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "MashTemp{" +
                "temp=" + temp +
                ", duration=" + duration +
                '}';
    }
}
