package com.example.beer.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Method implements Serializable {
    private List<MashTemp> mash_temp;
    private Fermentation fermentation;
    private String twist;
}
