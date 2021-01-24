package com.example.beer.mapper;

import com.example.beer.entity.HopEntity;
import com.example.beer.entity.IngredientsEntity;
import com.example.beer.entity.MaltEntity;
import com.example.beer.model.Hop;
import com.example.beer.model.Ingredient;
import com.example.beer.model.Malt;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-24T20:28:55+0100",
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

        ingredientsEntity.setMalt( maltListToMaltEntityList( ingredient.getMalt() ) );
        ingredientsEntity.setHops( hopListToHopEntityList( ingredient.getHops() ) );
        ingredientsEntity.setYeast( ingredient.getYeast() );

        return ingredientsEntity;
    }

    protected MaltEntity maltToMaltEntity(Malt malt) {
        if ( malt == null ) {
            return null;
        }

        MaltEntity maltEntity = new MaltEntity();

        maltEntity.setName( malt.getName() );

        return maltEntity;
    }

    protected List<MaltEntity> maltListToMaltEntityList(List<Malt> list) {
        if ( list == null ) {
            return null;
        }

        List<MaltEntity> list1 = new ArrayList<MaltEntity>( list.size() );
        for ( Malt malt : list ) {
            list1.add( maltToMaltEntity( malt ) );
        }

        return list1;
    }

    protected HopEntity hopToHopEntity(Hop hop) {
        if ( hop == null ) {
            return null;
        }

        HopEntity hopEntity = new HopEntity();

        hopEntity.setName( hop.getName() );
        hopEntity.setAdd( hop.getAdd() );
        hopEntity.setAttribute( hop.getAttribute() );

        return hopEntity;
    }

    protected List<HopEntity> hopListToHopEntityList(List<Hop> list) {
        if ( list == null ) {
            return null;
        }

        List<HopEntity> list1 = new ArrayList<HopEntity>( list.size() );
        for ( Hop hop : list ) {
            list1.add( hopToHopEntity( hop ) );
        }

        return list1;
    }
}
