package com.example.beer.mapper;

import com.example.beer.entity.MaltEntity;
import com.example.beer.model.Amount;
import com.example.beer.model.Malt;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-23T20:22:47+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_275 (Private Build)"
)
@Component
public class MaltMapperImpl implements MaltMapper {

    @Override
    public MaltEntity maptoDto(Malt malt) {
        if ( malt == null ) {
            return null;
        }

        MaltEntity maltEntity = new MaltEntity();

        maltEntity.setAmount_unit( maltAmountUnit( malt ) );
        maltEntity.setAmount_value( maltAmountValue( malt ) );
        maltEntity.setName( malt.getName() );

        return maltEntity;
    }

    private String maltAmountUnit(Malt malt) {
        if ( malt == null ) {
            return null;
        }
        Amount amount = malt.getAmount();
        if ( amount == null ) {
            return null;
        }
        String unit = amount.getUnit();
        if ( unit == null ) {
            return null;
        }
        return unit;
    }

    private Float maltAmountValue(Malt malt) {
        if ( malt == null ) {
            return null;
        }
        Amount amount = malt.getAmount();
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
