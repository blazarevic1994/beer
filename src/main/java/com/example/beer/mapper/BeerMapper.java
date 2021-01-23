package com.example.beer.mapper;


import com.example.beer.entity.BeerEntity;
import com.example.beer.model.Beer;

import com.example.beer.model.BoilVolume;
import com.example.beer.model.Volume;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface BeerMapper {

    @Mapping(target = "volume_value", source = "volume.value")
    @Mapping(target = "volume_unit", source = "volume.unit")
    @Mapping(target = "boil_volume_value", source = "boil_volume.value")
    @Mapping(target = "boil_volume_unit", source = "boil_volume.unit")
    BeerEntity maptoDto(Beer beer, Volume volume, BoilVolume boil_volume);
}
