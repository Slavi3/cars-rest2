package com.telerikacademy.demo.repositories;

import com.telerikacademy.demo.models.Car;

import java.util.List;

public interface CarRepository {
        void createCar(Car car);
        List<Car> getCars();
        Car getCarById(int id);
        void updateCar(int id,Car car);
        void deleteCar(int id);


}
