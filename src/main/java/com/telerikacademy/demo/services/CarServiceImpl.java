package com.telerikacademy.demo.services;

import com.telerikacademy.demo.models.Car;
import com.telerikacademy.demo.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarRepository repository;

    @Autowired
    public CarServiceImpl(CarRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createCar(Car car) {
        repository.createCar(car);
    }

    @Override
    public List<Car> getCars() {
        return repository.getCars();
    }

    @Override
    public Car getCarById(int id) {
        return repository.getCarById(id);
    }

    @Override
    public void updateCar(int id, Car car) {
        repository.updateCar(id, car);
    }

    @Override
    public void deleteCar(int id) {
        repository.deleteCar(id);
    }
}
