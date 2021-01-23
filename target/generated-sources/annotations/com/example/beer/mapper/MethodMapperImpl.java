package com.example.beer.mapper;

import com.example.beer.entity.FermentationEntity;
import com.example.beer.entity.MethodEntity;
import com.example.beer.model.Fermentation;
import com.example.beer.model.Method;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-23T17:07:42+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_275 (Private Build)"
)
@Component
public class MethodMapperImpl implements MethodMapper {

    @Override
    public MethodEntity maptoDto(Method method) {
        if ( method == null ) {
            return null;
        }

        MethodEntity methodEntity = new MethodEntity();

        methodEntity.setFermentation( fermentationToFermentationEntity( method.getFermentation() ) );
        methodEntity.setTwist( method.getTwist() );

        return methodEntity;
    }

    protected FermentationEntity fermentationToFermentationEntity(Fermentation fermentation) {
        if ( fermentation == null ) {
            return null;
        }

        FermentationEntity fermentationEntity = new FermentationEntity();

        return fermentationEntity;
    }
}
