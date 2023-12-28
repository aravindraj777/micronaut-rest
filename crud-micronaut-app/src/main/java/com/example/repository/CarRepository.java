package com.example.repository;

import com.example.entity.CarEntity;
import io.micronaut.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity,Long> {

}
