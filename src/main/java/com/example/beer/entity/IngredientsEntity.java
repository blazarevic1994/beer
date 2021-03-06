package com.example.beer.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class IngredientsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "beerEntity", referencedColumnName = "id")
    private BeerEntity beerEntity;

    @OneToMany(
            mappedBy = "ingredientsEntity",
            cascade = CascadeType.ALL
    )
    private List<MaltEntity> malt;

    @OneToMany(
            mappedBy = "ingredientsEntity",
            cascade = CascadeType.ALL
    )
    private List<HopEntity> hops;

    private String yeast;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BeerEntity getBeerEntity() {
        return beerEntity;
    }

    public void setBeerEntity(BeerEntity beerEntity) {
        this.beerEntity = beerEntity;
    }

    public List<MaltEntity> getMalt() {
        return malt;
    }

    public void setMalt(List<MaltEntity> malt) {
        this.malt = malt;
    }

    public List<HopEntity> getHops() {
        return hops;
    }

    public void setHops(List<HopEntity> hops) {
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
        return "IngredientsEntity{" +
                "id=" + id +
                ", malt=" + malt +
                ", hops=" + hops +
                ", yeast='" + yeast + '\'' +
                '}';
    }
}
