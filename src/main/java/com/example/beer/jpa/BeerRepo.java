package com.example.beer.jpa;

import com.example.beer.entity.BeerEntity;
import com.example.beer.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BeerRepo extends JpaRepository<BeerEntity, Integer> {
}
