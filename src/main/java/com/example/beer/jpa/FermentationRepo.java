package com.example.beer.jpa;

import com.example.beer.entity.FermentationEntity;
import com.example.beer.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FermentationRepo extends JpaRepository<FermentationEntity, Integer> {
}
