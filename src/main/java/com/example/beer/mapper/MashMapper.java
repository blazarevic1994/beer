package com.example.beer.mapper;


import com.example.beer.entity.FoodPairEntity;
import com.example.beer.entity.MashTempEntity;
import com.example.beer.entity.MethodEntity;
import com.example.beer.model.MashTemp;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface MashMapper {

    @Mapping(target = "temp_value", source = "mashTemp.temp.value")
    @Mapping(target = "temp_unit", source = "mashTemp.temp.unit")
    @Mapping(target = "methodEntity", source = "me")
    @Mapping(target = "id", ignore = true)
    MashTempEntity maptoDto(MashTemp mashTemp, MethodEntity me);
}
