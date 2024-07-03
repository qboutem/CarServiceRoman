package com.hromenko.carserviceroman.controller;

import com.hromenko.carserviceroman.model.Car;
import com.hromenko.carserviceroman.proxies.ServerProxy;
import com.hromenko.carserviceroman.repository.CarRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class CarRestController {
    private final ServerProxy proxy;
    private final CarRepository carRepository;

    @GetMapping("/{id}")
    public Car showCarById(@PathVariable Long id){
        return carRepository.findById(id).orElseThrow();
    }
}

