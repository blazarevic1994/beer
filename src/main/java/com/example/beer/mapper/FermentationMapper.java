package com.example.beer.mapper;


import com.example.beer.entity.FermentationEntity;
import com.example.beer.model.Fermentation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface FermentationMapper {

    @Mapping(target = "temp_value", source = "fermentation.temp.value")
    @Mapping(target = "temp_unit", source = "fermentation.temp.unit")
    FermentationEntity maptoDto(Fermentation fermentation);
}
