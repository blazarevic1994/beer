package com.example.beer.mapper;

import com.example.beer.entity.MashTempEntity;
import com.example.beer.model.MashTemp;
import com.example.beer.model.Temperature;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-23T20:22:48+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_275 (Private Build)"
)
@Component
public class MashMapperImpl implements MashMapper {

    @Override
    public MashTempEntity maptoDto(MashTemp mashTemp) {
        if ( mashTemp == null ) {
            return null;
        }

        MashTempEntity mashTempEntity = new MashTempEntity();

        mashTempEntity.setTemp_value( mashTempTempValue( mashTemp ) );
        mashTempEntity.setTemp_unit( mashTempTempUnit( mashTemp ) );
        mashTempEntity.setDuration( mashTemp.getDuration() );

        return mashTempEntity;
    }

    private Float mashTempTempValue(MashTemp mashTemp) {
        if ( mashTemp == null ) {
            return null;
        }
        Temperature temp = mashTemp.getTemp();
        if ( temp == null ) {
            return null;
        }
        Float value = temp.getValue();
        if ( value == null ) {
            return null;
        }
        return value;
    }

    private String mashTempTempUnit(MashTemp mashTemp) {
        if ( mashTemp == null ) {
            return null;
        }
        Temperature temp = mashTemp.getTemp();
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
