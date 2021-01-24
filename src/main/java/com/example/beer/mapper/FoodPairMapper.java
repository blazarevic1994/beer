package com.example.beer.mapper;


import com.example.beer.entity.BeerEntity;
import com.example.beer.entity.FermentationEntity;
import com.example.beer.entity.FoodPairEntity;
import com.example.beer.model.Fermentation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface FoodPairMapper {

    @Mapping(target = "value", source = "value")
    @Mapping(target = "beerEntity", source = "beerEntity")
    @Mapping(target = "id", ignore = true)
    FoodPairEntity maptoDto(String value, BeerEntity beerEntity);
}
