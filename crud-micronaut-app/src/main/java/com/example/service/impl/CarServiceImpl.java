package com.example.service.impl;

import com.example.repository.BrandRepository;
import com.example.repository.CarRepository;
import com.example.service.CarService;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;


@Singleton
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final BrandRepository brandRepository;
}
