package com.example.beer.jpa;

import com.example.beer.entity.FoodPairEntity;
import com.example.beer.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FoodPairRepo extends JpaRepository<FoodPairEntity, Integer> {
}
