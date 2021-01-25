package com.example.beer.jpa;

import com.example.beer.entity.MaltEntity;
import com.example.beer.entity.MashTempEntity;
import com.example.beer.entity.MethodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface MashTempRepo extends JpaRepository<MashTempEntity, Integer> {

    @Query("SELECT AVG(temp_value) FROM MashTempEntity m WHERE  m.methodEntity = :id")
    public float avgTempValue(MethodEntity id);
}
