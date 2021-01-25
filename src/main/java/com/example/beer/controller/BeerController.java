package com.example.beer.controller;

import com.example.beer.entity.*;
import com.example.beer.jpa.BeerRepo;
import com.example.beer.jpa.FermentationRepo;
import com.example.beer.jpa.MashTempRepo;
import com.example.beer.mapper.*;
import com.example.beer.model.Beer;
import com.example.beer.model.BeerPresentationModel;
import com.example.beer.model.Ingredient;
import com.example.beer.model.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class BeerController {
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
    private BeerPresentMapper beerPresentMapper;

    @Autowired
    private BeerRepo beerRepo;
    @Autowired
    private MashTempRepo mashTempRepo;
    @Autowired
    private FermentationRepo fermentationRepo;


    @GetMapping("/beers")
    public ResponseEntity getBeers(){
        List<BeerEntity> beerEntities = beerRepo.findAll();
        List<BeerPresentationModel> beerPresentationModels = beerEntities.stream().map(x->mapBeerToPresentation(x)).collect(Collectors.toList());
        return ResponseEntity.ok(beerPresentationModels);
    }

   @GetMapping("/beers/{id}")
   public ResponseEntity getBeer(@PathVariable int id){
       Optional<BeerEntity> beerEntity = beerRepo.findById(id);
       if (beerEntity.isPresent())
       {
          BeerPresentationModel bpm = mapBeerToPresentation(beerEntity.get());
          return ResponseEntity.ok(bpm);
       }
       return ResponseEntity.notFound().build();
   }

    @DeleteMapping("/beers/{id}")
    public ResponseEntity deleteBeer(@PathVariable int id){
        beerRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/fillUpBeer")
    public ResponseEntity fillUp(@RequestBody Beer beer){

        int id = insertBeer(beer);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(id).toUri();

        return ResponseEntity.created(location).build();
    }

    @PostMapping("/fillUpListBeers")
    public ResponseEntity fillUp(@RequestBody List<Beer> beers){

       // List<BeerEntity> beerEntities = beers.stream().map(x -> beerMapper.maptoDto(x)).collect(Collectors.toList());

        for(int i=0; i<beers.size(); i++) {
            Beer beer = beers.get(i);
            int id = insertBeer(beer);
        }
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(location).build();
    }

    private int insertBeer(Beer beer){

        setStandardDateFormat(beer);
        BeerEntity beerEntity = beerMapper.maptoDto(beer);


        Method method = beer.getMethod();
        MethodEntity methodEntity = methodMapper.maptoDto(method);

        FermentationEntity fermentationEntity = fermentationMapper.maptoDto(method.getFermentation(),methodEntity);
        List<MashTempEntity> mashTempEntities = method.getMash_temp().stream().map(x -> mashMapper.maptoDto(x,methodEntity)).collect(Collectors.toList());

        methodEntity.setFermentation(fermentationEntity);
        methodEntity.setMashTemps(mashTempEntities);
        methodEntity.setBeerEntity(beerEntity);
        beerEntity.setMethod(methodEntity);

        Ingredient ingredient = beer.getIngredients();
        IngredientsEntity ingredientsEntity = ingredientsMapper.maptoDto(ingredient);

        List<HopEntity> hopEntities = ingredient.getHops().stream().map(x -> hopMapper.maptoDto(x,ingredientsEntity)).collect(Collectors.toList());
        List<MaltEntity> maltEntities = ingredient.getMalt().stream().map(x -> maltMapper.maptoDto(x,ingredientsEntity)).collect(Collectors.toList());


        ingredientsEntity.setHops(hopEntities);
        ingredientsEntity.setMalt(maltEntities);
        ingredientsEntity.setBeerEntity(beerEntity);
        beerEntity.setIngredient(ingredientsEntity);


        List<FoodPairEntity> foods = beer.getFood_pairing().stream().map(x->foodPairMapper.maptoDto(x, beerEntity)).collect(Collectors.toList());
        beerEntity.setFoods(foods);


        return beerRepo.save(beerEntity).getId();
    }

    private void setStandardDateFormat(Beer beer){
        beer.setFirst_brewed("01/"+beer.getFirst_brewed());   // dd/MM/YYYY
    }

    private BeerPresentationModel mapBeerToPresentation(BeerEntity beerEntity) {

        BeerPresentationModel bpm = beerPresentMapper.maptoDto(beerEntity);

        bpm.setMeanMashTemperature(mashTempRepo.avgTempValue(beerEntity.getMethod()));
        bpm.setMeanFermentationTemperature(fermentationRepo.avgTempValue(beerEntity.getMethod()));
        return bpm;
    }
}
