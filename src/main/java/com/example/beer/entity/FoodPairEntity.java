package com.example.beer.entity;


import javax.persistence.*;


@Entity
public class FoodPairEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private BeerEntity beerEntity;

    private String value;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "FoodPairEntity{" +
                "id=" + id +
                ", beerEntity=" + beerEntity +
                ", value='" + value + '\'' +
                '}';
    }
}
