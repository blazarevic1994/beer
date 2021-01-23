package com.example.beer.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
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


    

}
