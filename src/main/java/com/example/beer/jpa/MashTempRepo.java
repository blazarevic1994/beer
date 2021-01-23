package com.example.beer.jpa;

import com.example.beer.entity.MaltEntity;
import com.example.beer.entity.MashTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MashTempRepo extends JpaRepository<MashTempEntity, Integer> {
}
