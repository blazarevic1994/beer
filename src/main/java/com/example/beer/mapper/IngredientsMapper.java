package com.example.beer.mapper;


import com.example.beer.entity.IngredientsEntity;
import com.example.beer.model.Ingredient;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface IngredientsMapper {

    IngredientsEntity maptoDto(Ingredient ingredient);
}
