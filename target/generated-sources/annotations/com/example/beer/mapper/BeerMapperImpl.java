package com.example.beer.mapper;

import com.example.beer.entity.BeerEntity;
import com.example.beer.entity.FermentationEntity;
import com.example.beer.entity.MethodEntity;
import com.example.beer.model.Beer;
import com.example.beer.model.BoilVolume;
import com.example.beer.model.Fermentation;
import com.example.beer.model.Method;
import com.example.beer.model.Volume;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-24T20:28:55+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_275 (Private Build)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerEntity maptoDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerEntity beerEntity = new BeerEntity();

        beerEntity.setVolume_value( beerVolumeValue( beer ) );
        try {
            if ( beer.getFirst_brewed() != null ) {
                beerEntity.setFirst_brewed( new SimpleDateFormat( "dd/MM/yyyy" ).parse( beer.getFirst_brewed() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        beerEntity.setBoil_volume_value( beerBoil_volumeValue( beer ) );
        beerEntity.setBoil_volume_unit( beerBoil_volumeUnit( beer ) );
        beerEntity.setVolume_unit( beerVolumeUnit( beer ) );
        beerEntity.setId( beer.getId() );
        beerEntity.setName( beer.getName() );
        beerEntity.setTagline( beer.getTagline() );
        beerEntity.setDescription( beer.getDescription() );
        beerEntity.setImage_url( beer.getImage_url() );
        beerEntity.setAbv( beer.getAbv() );
        beerEntity.setIbu( beer.getIbu() );
        beerEntity.setTarget_fg( beer.getTarget_fg() );
        beerEntity.setTarget_og( beer.getTarget_og() );
        beerEntity.setEbc( beer.getEbc() );
        beerEntity.setSrm( beer.getSrm() );
        beerEntity.setPh( beer.getPh() );
        beerEntity.setAttenuation_level( beer.getAttenuation_level() );
        beerEntity.setMethod( methodToMethodEntity( beer.getMethod() ) );
        beerEntity.setBrewers_tips( beer.getBrewers_tips() );
        beerEntity.setContributed_by( beer.getContributed_by() );

        return beerEntity;
    }

    private Float beerVolumeValue(Beer beer) {
        if ( beer == null ) {
            return null;
        }
        Volume volume = beer.getVolume();
        if ( volume == null ) {
            return null;
        }
        Float value = volume.getValue();
        if ( value == null ) {
            return null;
        }
        return value;
    }

    private Float beerBoil_volumeValue(Beer beer) {
        if ( beer == null ) {
            return null;
        }
        BoilVolume boil_volume = beer.getBoil_volume();
        if ( boil_volume == null ) {
            return null;
        }
        Float value = boil_volume.getValue();
        if ( value == null ) {
            return null;
        }
        return value;
    }

    private String beerBoil_volumeUnit(Beer beer) {
        if ( beer == null ) {
            return null;
        }
        BoilVolume boil_volume = beer.getBoil_volume();
        if ( boil_volume == null ) {
            return null;
        }
        String unit = boil_volume.getUnit();
        if ( unit == null ) {
            return null;
        }
        return unit;
    }

    private String beerVolumeUnit(Beer beer) {
        if ( beer == null ) {
            return null;
        }
        Volume volume = beer.getVolume();
        if ( volume == null ) {
            return null;
        }
        String unit = volume.getUnit();
        if ( unit == null ) {
            return null;
        }
        return unit;
    }

    protected FermentationEntity fermentationToFermentationEntity(Fermentation fermentation) {
        if ( fermentation == null ) {
            return null;
        }

        FermentationEntity fermentationEntity = new FermentationEntity();

        return fermentationEntity;
    }

    protected MethodEntity methodToMethodEntity(Method method) {
        if ( method == null ) {
            return null;
        }

        MethodEntity methodEntity = new MethodEntity();

        methodEntity.setFermentation( fermentationToFermentationEntity( method.getFermentation() ) );
        methodEntity.setTwist( method.getTwist() );

        return methodEntity;
    }
}
