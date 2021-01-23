package com.example.beer.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Fermentation implements Serializable {
    private Temperature temp;
}
