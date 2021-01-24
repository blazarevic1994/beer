package com.example.beer.mapper;


import com.example.beer.entity.BeerEntity;
import com.example.beer.model.Beer;

import com.example.beer.model.BoilVolume;
import com.example.beer.model.Volume;
import jdk.jfr.MemoryAddress;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.text.SimpleDateFormat;


@Mapper(componentModel = "spring")
public interface BeerMapper {

    @Mapping(target = "volume_value", source = "beer.volume.value")
    @Mapping(target = "volume_unit", source = "beer.volume.unit")
    @Mapping(target = "boil_volume_value", source = "beer.boil_volume.value")
    @Mapping(target = "boil_volume_unit", source = "beer.boil_volume.unit")
    @Mapping(target = "first_brewed", dateFormat = "dd/MM/yyyy", source = "first_brewed")
        //@Mapping(target = "first_brewed", source = "java(new java.text.SimpleDateFormat( \"yyyy-MM-dd\" ).parse( beer.first_brewed ))")
    BeerEntity maptoDto(Beer beer);
}
