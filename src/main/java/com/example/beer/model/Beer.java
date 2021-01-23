package com.example.beer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class Beer implements Serializable {
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
    private Volume volume;
    private BoilVolume boil_volume;
    private Method method;
    private Ingredient ingredients;
    private List<String> food_pairing;
    private String brewers_tips;
    private String contributed_by;
}
