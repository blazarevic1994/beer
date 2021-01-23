package com.example.beer.controller;

import com.example.beer.entity.BeerEntity;
import com.example.beer.entity.FoodPairEntity;
import com.example.beer.mapper.BeerMapper;
import com.example.beer.mapper.FoodPairMapper;
import com.example.beer.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    private  BeerMapper beerMapper;
    @Autowired
    private FoodPairMapper foodPairMapper;

    private List<Beer> beers = new ArrayList<>();

    @GetMapping("/all")
    public List<Beer> getAllInfo(){
        return beers;
    }
    @PostMapping("/beer")
    public void addBeer(@RequestBody List<Beer> beer){
        BeerEntity beerEntity = beerMapper.maptoDto(beer.get(0));
        FoodPairEntity foodPairEntity = foodPairMapper.maptoDto(beer.get(0).getFood_pairing().get(0));

        System.out.println(beerEntity);
        System.out.println(foodPairEntity);
        //beers.add(beer.get(0));

    }
}
