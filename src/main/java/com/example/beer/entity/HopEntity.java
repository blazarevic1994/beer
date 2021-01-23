package com.example.beer.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class HopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private IngredientsEntity ingredientsEntity;

    private String name;
    private Float amount_value;
    private String amount_unit;
    private String add;
    private String attribute;
}
