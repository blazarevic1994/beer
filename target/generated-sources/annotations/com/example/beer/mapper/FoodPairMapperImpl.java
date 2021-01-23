package com.example.beer.mapper;

import com.example.beer.entity.FoodPairEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-23T20:22:47+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_275 (Private Build)"
)
@Component
public class FoodPairMapperImpl implements FoodPairMapper {

    @Override
    public FoodPairEntity maptoDto(String value) {
        if ( value == null ) {
            return null;
        }

        FoodPairEntity foodPairEntity = new FoodPairEntity();

        foodPairEntity.setValue( value );

        return foodPairEntity;
    }
}
