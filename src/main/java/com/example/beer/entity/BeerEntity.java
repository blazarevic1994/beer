package com.example.beer.entity;

import com.example.beer.model.Fermentation;
import com.example.beer.model.MashTemp;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class BeerEntity {
    @Id
    private Integer id;

    private String name;
    private String tagline;
    private Date first_brewed;
    private String description;
    private String image_url;
    private Float abv;
    private Float ibu;
    private Float target_fg;
    private Float target_og;
    private Float ebc;
    private Float srm;
    private Float ph;
    private Float attenuation_level;
    private Float volume_value;
    private String volume_unit;
    private Float boil_volume_value;
    private String boil_volume_unit;

    @OneToOne(
            mappedBy = "beerEntity",
            cascade = CascadeType.ALL
    )
    private MethodEntity method;

    @OneToOne(
            mappedBy = "beerEntity",
            cascade = CascadeType.ALL
    )
    private IngredientsEntity ingredient;

    @OneToMany(
            mappedBy = "beerEntity",
            cascade = CascadeType.ALL
    )
    private List<FoodPairEntity> food_pairing;

    private String brewers_tips;
    private String contributed_by;
}
