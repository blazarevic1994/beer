package com.example.beer.controller;

import com.example.beer.entity.*;
import com.example.beer.jpa.BeerRepo;
import com.example.beer.mapper.*;
import com.example.beer.model.*;
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
    @Autowired
    private FermentationMapper fermentationMapper;
    @Autowired
    private MethodMapper methodMapper;
    @Autowired
    private MashMapper mashMapper;
    @Autowired
    private IngredientsMapper ingredientsMapper;
    @Autowired
    private HopMapper hopMapper;
    @Autowired
    private MaltMapper maltMapper;
    @Autowired
    private BeerRepo beerRepo;

    private List<Beer> beers = new ArrayList<>();

    @GetMapping("/all")
    public List<Beer> getAllInfo(){
        return beers;
    }
    @PostMapping("/beer")
    public void addBeer(@RequestBody List<Beer> beers){
        Beer beer = beers.get(0);

        BeerEntity beerEntity = beerMapper.maptoDto(beer);

        Method method = beer.getMethod();
        List<MashTempEntity> mashTempEntities = new ArrayList<MashTempEntity>();
        FermentationEntity fermentationEntity = fermentationMapper.maptoDto(method.getFermentation());
        for (MashTemp mashTemp: method.getMash_temp()){
            mashTempEntities.add(mashMapper.maptoDto(mashTemp));
        }
        MethodEntity methodEntity = methodMapper.maptoDto(method);
        methodEntity.setFermentation(fermentationEntity);
        methodEntity.setMashTemps(mashTempEntities);
        beerEntity.setMethod(methodEntity);

        Ingredient ingredient = beer.getIngredients();
        List<HopEntity> hopEntities = new ArrayList<HopEntity>();

        List<MaltEntity> maltEntities = new ArrayList<MaltEntity>();

        for (Malt malt: ingredient.getMalt()){
            maltEntities.add(maltMapper.maptoDto(malt));
        }

        for (Hop hop: ingredient.getHops()){
            hopEntities.add(hopMapper.maptoDto(hop));
        }



        IngredientsEntity ingredientsEntity = ingredientsMapper.maptoDto(ingredient);
        ingredientsEntity.setHops(hopEntities);
        ingredientsEntity.setMalt(maltEntities);

        List<FoodPairEntity> foods = new ArrayList<>();
        for (String f:beer.getFood_pairing()){
            foods.add(foodPairMapper.maptoDto(f));
        }
        beerEntity.setFoods(foods);
        beerRepo.save(beerEntity);

       // beerEntity.setMethod();

        System.out.println(beerEntity);
        //beers.add(beer.get(0));

    }
}
