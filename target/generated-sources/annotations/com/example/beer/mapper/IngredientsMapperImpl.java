package com.example.beer.mapper;

import com.example.beer.entity.IngredientsEntity;
import com.example.beer.model.Ingredient;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-23T16:50:50+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_275 (Private Build)"
)
@Component
public class IngredientsMapperImpl implements IngredientsMapper {

    @Override
    public IngredientsEntity maptoDto(Ingredient ingredient) {
        if ( ingredient == null ) {
            return null;
        }

        IngredientsEntity ingredientsEntity = new IngredientsEntity();

        return ingredientsEntity;
    }
}
