package com.example.beer.jpa;

import com.example.beer.entity.IngredientsEntity;
import com.example.beer.entity.MaltEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MaltRepo extends JpaRepository<MaltEntity, Integer> {
}
