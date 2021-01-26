package com.example.beer.mapper;

import com.example.beer.entity.BeerEntity;
import com.example.beer.model.BeerPresentationModel;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-26T21:32:36+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_275 (Private Build)"
)
@Component
public class BeerPresentMapperImpl implements BeerPresentMapper {

    @Override
    public BeerPresentationModel maptoDto(BeerEntity beerEntity) {
        if ( beerEntity == null ) {
            return null;
        }

        BeerPresentationModel beerPresentationModel = new BeerPresentationModel();

        beerPresentationModel.setId( beerEntity.getId() );
        beerPresentationModel.setName( beerEntity.getName() );
        beerPresentationModel.setDescription( beerEntity.getDescription() );

        return beerPresentationModel;
    }
}
