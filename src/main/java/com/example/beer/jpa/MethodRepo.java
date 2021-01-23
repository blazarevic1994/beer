package com.example.beer.jpa;

import com.example.beer.entity.MethodEntity;
import com.example.beer.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MethodRepo extends JpaRepository<MethodEntity, Integer> {
}
