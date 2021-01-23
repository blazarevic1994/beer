package com.example.beer.jpa;

import com.example.beer.entity.HopEntity;
import com.example.beer.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HopRepo extends JpaRepository<HopEntity, Integer> {
}
