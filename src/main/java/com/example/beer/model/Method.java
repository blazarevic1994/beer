package com.example.beer.model;



import java.io.Serializable;
import java.util.List;


public class Method implements Serializable {
    private List<MashTemp> mash_temp;
    private Fermentation fermentation;
    private String twist;

    public List<MashTemp> getMash_temp() {
        return mash_temp;
    }

    public void setMash_temp(List<MashTemp> mash_temp) {
        this.mash_temp = mash_temp;
    }

    public Fermentation getFermentation() {
        return fermentation;
    }

    public void setFermentation(Fermentation fermentation) {
        this.fermentation = fermentation;
    }

    public String getTwist() {
        return twist;
    }

    @Override
    public String toString() {
        return "Method{" +
                "mash_temp=" + mash_temp +
                ", fermentation=" + fermentation +
                ", twist='" + twist + '\'' +
                '}';
    }

    public void setTwist(String twist) {
        this.twist = twist;
    }
}
