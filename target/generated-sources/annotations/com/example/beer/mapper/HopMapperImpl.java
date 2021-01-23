package com.example.beer.mapper;

import com.example.beer.entity.HopEntity;
import com.example.beer.model.Amount;
import com.example.beer.model.Hop;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-23T17:07:42+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_275 (Private Build)"
)
@Component
public class HopMapperImpl implements HopMapper {

    @Override
    public HopEntity maptoDto(Hop hop) {
        if ( hop == null ) {
            return null;
        }

        HopEntity hopEntity = new HopEntity();

        hopEntity.setAmount_unit( hopAmountUnit( hop ) );
        hopEntity.setAmount_value( hopAmountValue( hop ) );
        hopEntity.setName( hop.getName() );
        hopEntity.setAdd( hop.getAdd() );
        hopEntity.setAttribute( hop.getAttribute() );

        return hopEntity;
    }

    private String hopAmountUnit(Hop hop) {
        if ( hop == null ) {
            return null;
        }
        Amount amount = hop.getAmount();
        if ( amount == null ) {
            return null;
        }
        String unit = amount.getUnit();
        if ( unit == null ) {
            return null;
        }
        return unit;
    }

    private Float hopAmountValue(Hop hop) {
        if ( hop == null ) {
            return null;
        }
        Amount amount = hop.getAmount();
        if ( amount == null ) {
            return null;
        }
        Float value = amount.getValue();
        if ( value == null ) {
            return null;
        }
        return value;
    }
}
