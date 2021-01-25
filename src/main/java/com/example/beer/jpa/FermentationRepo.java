package com.example.beer.jpa;

import com.example.beer.entity.FermentationEntity;
import com.example.beer.entity.MethodEntity;
import com.example.beer.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface FermentationRepo extends JpaRepository<FermentationEntity, Integer> {

    @Query("SELECT AVG(temp_value) FROM FermentationEntity f WHERE  f.methodEntity = :id")
    public float avgTempValue(MethodEntity id);
}
