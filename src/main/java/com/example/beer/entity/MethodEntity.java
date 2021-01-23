package com.example.beer.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class MethodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @OneToOne
    private BeerEntity beerEntity;

    @OneToMany(
            mappedBy = "methodEntity",
            cascade = CascadeType.ALL
    )
    private List<MashTempEntity> mashTemps;

    @OneToOne(
            mappedBy = "methodEntity",
            cascade = CascadeType.ALL
    )
    private FermentationEntity fermentation;

    private String twist;



}
