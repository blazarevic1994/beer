package com.example.beer.mapper;


import com.example.beer.entity.HopEntity;
import com.example.beer.model.Amount;
import com.example.beer.model.Hop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface HopMapper {

    @Mapping(target = "amount_value", source = "amount.value")
    @Mapping(target = "amount_unit", source = "amount.unit")
    HopEntity maptoDto(Hop hop, Amount amount);
}
