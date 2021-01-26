package com.example.beer.mapper;

import com.example.beer.entity.BeerEntity;
import com.example.beer.entity.FoodPairEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-26T20:14:07+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_275 (Private Build)"
)
@Component
public class FoodPairMapperImpl implements FoodPairMapper {

    @Override
    public FoodPairEntity maptoDto(String value, BeerEntity beerEntity) {
        if ( value == null && beerEntity == null ) {
            return null;
        }

        FoodPairEntity foodPairEntity = new FoodPairEntity();

        if ( value != null ) {
            foodPairEntity.setValue( value );
        }
        if ( beerEntity != null ) {
            foodPairEntity.setBeerEntity( beerEntity );
        }

        return foodPairEntity;
    }
}
