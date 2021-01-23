package com.example.beer.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Ingredient implements Serializable {
    private List<Malt> malts;
    private List<Hop> hops;
    private String yeast;

}
