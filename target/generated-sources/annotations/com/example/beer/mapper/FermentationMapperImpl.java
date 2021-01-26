package com.example.beer.mapper;

import com.example.beer.entity.FermentationEntity;
import com.example.beer.entity.MethodEntity;
import com.example.beer.model.Fermentation;
import com.example.beer.model.Temperature;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-26T20:53:57+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_275 (Private Build)"
)
@Component
public class FermentationMapperImpl implements FermentationMapper {

    @Override
    public FermentationEntity maptoDto(Fermentation fermentation, MethodEntity me) {
        if ( fermentation == null && me == null ) {
            return null;
        }

        FermentationEntity fermentationEntity = new FermentationEntity();

        if ( fermentation != null ) {
            fermentationEntity.setTemp_value( fermentationTempValue( fermentation ) );
            fermentationEntity.setTemp_unit( fermentationTempUnit( fermentation ) );
        }
        if ( me != null ) {
            fermentationEntity.setMethodEntity( me );
        }

        return fermentationEntity;
    }

    private Float fermentationTempValue(Fermentation fermentation) {
        if ( fermentation == null ) {
            return null;
        }
        Temperature temp = fermentation.getTemp();
        if ( temp == null ) {
            return null;
        }
        Float value = temp.getValue();
        if ( value == null ) {
            return null;
        }
        return value;
    }

    private String fermentationTempUnit(Fermentation fermentation) {
        if ( fermentation == null ) {
            return null;
        }
        Temperature temp = fermentation.getTemp();
        if ( temp == null ) {
            return null;
        }
        String unit = temp.getUnit();
        if ( unit == null ) {
            return null;
        }
        return unit;
    }
}
