package com.example.beer.mapper;


import com.example.beer.entity.FermentationEntity;
import com.example.beer.entity.FoodPairEntity;
import com.example.beer.model.Fermentation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface FoodPairMapper {

    @Mapping(target = "value", source = "value")
    FoodPairEntity maptoDto(String value);
}
