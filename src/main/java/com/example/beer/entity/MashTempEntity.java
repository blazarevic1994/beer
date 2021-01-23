package com.example.beer.entity;

import com.example.beer.model.Temperature;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class MashTempEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private MethodEntity methodEntity;

    private Float temp_value;
    private String temp_unit;
    private Float duration;
}
