package com.example.beer.model;



import java.io.Serializable;
import java.util.List;


public class Ingredient implements Serializable {
    private List<Malt> malts;
    private List<Hop> hops;
    private String yeast;

    public List<Malt> getMalts() {
        return malts;
    }

    public void setMalts(List<Malt> malts) {
        this.malts = malts;
    }

    public List<Hop> getHops() {
        return hops;
    }

    public void setHops(List<Hop> hops) {
        this.hops = hops;
    }

    public String getYeast() {
        return yeast;
    }

    public void setYeast(String yeast) {
        this.yeast = yeast;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "malts=" + malts +
                ", hops=" + hops +
                ", yeast='" + yeast + '\'' +
                '}';
    }
}
