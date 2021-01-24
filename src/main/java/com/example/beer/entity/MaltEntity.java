package com.example.beer.entity;

import javax.persistence.*;


@Entity
public class MaltEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ingredientsEntity", referencedColumnName = "id")
    private IngredientsEntity ingredientsEntity;

    private String name;
    private Float amount_value;
    private String amount_unit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IngredientsEntity getIngredientsEntity() {
        return ingredientsEntity;
    }

    public void setIngredientsEntity(IngredientsEntity ingredientsEntity) {
        this.ingredientsEntity = ingredientsEntity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAmount_value() {
        return amount_value;
    }

    public void setAmount_value(Float amount_value) {
        this.amount_value = amount_value;
    }

    public String getAmount_unit() {
        return amount_unit;
    }

    public void setAmount_unit(String amount_unit) {
        this.amount_unit = amount_unit;
    }

    @Override
    public String toString() {
        return "MaltEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount_value=" + amount_value +
                ", amount_unit='" + amount_unit + '\'' +
                '}';
    }
}
