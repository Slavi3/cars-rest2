package com.telerikacademy.demo.controllers;

import com.telerikacademy.demo.models.Car;
import com.telerikacademy.demo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class CarsController {
    private CarService service;

    @Autowired
    public CarsController(CarService service) {
        this.service = service;
    }


    @GetMapping
    public List<Car> getCars() {
        return service.getCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable int id) {
        return service.getCarById(id);
    }

    @PostMapping("/new")
    public void createCar(@RequestBody Car car) {
        service.createCar(car);
    }
}
