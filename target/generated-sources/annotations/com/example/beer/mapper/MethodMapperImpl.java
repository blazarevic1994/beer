package com.example.beer.mapper;

import com.example.beer.entity.MethodEntity;
import com.example.beer.model.Method;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-23T16:50:50+0100",
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

        return methodEntity;
    }
}
