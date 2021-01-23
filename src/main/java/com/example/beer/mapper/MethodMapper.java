package com.example.beer.mapper;


import com.example.beer.entity.MethodEntity;
import com.example.beer.model.Method;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface MethodMapper {

    MethodEntity maptoDto(Method method);
}
