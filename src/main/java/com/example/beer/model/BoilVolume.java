package com.example.beer.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BoilVolume implements Serializable {
    private Float value;
    private String unit;
}
