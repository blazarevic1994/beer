package com.example.beer.model;



import java.io.Serializable;
import java.util.List;


public class Ingredient implements Serializable {
    private List<Malt> malt;
    private List<Hop> hops;
    private String yeast;

    public List<Malt> getMalt() {
        return malt;
    }

    public void setMalt(List<Malt> malt) {
        this.malt = malt;
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
                "malt=" + malt +
                ", hops=" + hops +
                ", yeast='" + yeast + '\'' +
                '}';
    }
}
