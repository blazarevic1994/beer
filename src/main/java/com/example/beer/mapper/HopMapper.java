package com.example.beer.mapper;


import com.example.beer.entity.HopEntity;
import com.example.beer.entity.IngredientsEntity;
import com.example.beer.model.Amount;
import com.example.beer.model.Hop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface HopMapper {

    @Mapping(target = "amount_value", source = "hop.amount.value")
    @Mapping(target = "amount_unit", source = "hop.amount.unit")
    @Mapping(target = "ingredientsEntity", source = "ingredientsEntity")
    @Mapping(target = "id", ignore = true)
    HopEntity maptoDto(Hop hop, IngredientsEntity ingredientsEntity);
}
