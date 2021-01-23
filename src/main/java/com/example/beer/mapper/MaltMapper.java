package com.example.beer.mapper;


import com.example.beer.entity.HopEntity;
import com.example.beer.entity.MaltEntity;
import com.example.beer.model.Hop;
import com.example.beer.model.Malt;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface MaltMapper {

    @Mapping(target = "amount_value", source = "malt.amount.value")
    @Mapping(target = "amount_unit", source = "malt.amount.unit")
    MaltEntity maptoDto(Malt malt);
}
