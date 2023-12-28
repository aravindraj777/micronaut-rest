package com.example.repository;

import com.example.entity.BrandEntity;
import io.micronaut.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BrandRepository extends JpaRepository<BrandEntity,Long> {

    Optional<BrandEntity> findByName(String name);
}
