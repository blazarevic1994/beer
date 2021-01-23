package com.example.beer.jpa;

import com.example.beer.entity.IngredientsEntity;
import com.example.beer.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IngredientsRepo extends JpaRepository<IngredientsEntity, Integer> {
}
