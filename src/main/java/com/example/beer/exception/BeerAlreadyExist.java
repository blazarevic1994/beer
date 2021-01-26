package com.example.beer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class BeerAlreadyExist extends RuntimeException {

    public BeerAlreadyExist(String exception) {
        super(exception);

    }
}
