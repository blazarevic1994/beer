package com.example.beer.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MashTemp implements Serializable {
    private Temperature temp;
    private Float duration;
}
