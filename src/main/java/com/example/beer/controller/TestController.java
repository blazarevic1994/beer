package com.example.beer.controller;

import com.example.beer.model.Beer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    private List<Beer> beers = new ArrayList<>();

    @GetMapping("/all")
    public List<Beer> getAllInfo(){
        return beers;
    }
    @PostMapping("/beer")
    public void addBeer(@RequestBody List<Beer> beer){
        beers.add(beer.get(0));
    }
}
