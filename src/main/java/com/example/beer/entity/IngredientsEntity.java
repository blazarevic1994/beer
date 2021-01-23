package com.example.beer.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class IngredientsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private BeerEntity beerEntity;

    @OneToMany(
            mappedBy = "ingredientsEntity",
            cascade = CascadeType.ALL
    )
    private List<MaltEntity> malts;

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

    public List<MaltEntity> getMalts() {
        return malts;
    }

    public void setMalts(List<MaltEntity> malts) {
        this.malts = malts;
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
                ", beerEntity=" + beerEntity +
                ", malts=" + malts +
                ", hops=" + hops +
                ", yeast='" + yeast + '\'' +
                '}';
    }
}
