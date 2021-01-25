package com.example.beer.mapper;


import com.example.beer.entity.BeerEntity;
import com.example.beer.model.Beer;
import com.example.beer.model.BeerPresentationModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface BeerPresentMapper {

    BeerPresentationModel maptoDto(BeerEntity beerEntity);
}
