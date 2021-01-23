package com.example.beer.entity;

import com.example.beer.model.Amount;
import com.example.beer.model.Ingredient;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class MaltEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private IngredientsEntity ingredientsEntity;

    private String name;
    private Float amount_value;
    private String amount_unit;

}
