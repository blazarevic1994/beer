package com.example.beer.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Hop implements Serializable {
    private String name;
    private Amount amount;
    private String add;
    private String attribute;
}
