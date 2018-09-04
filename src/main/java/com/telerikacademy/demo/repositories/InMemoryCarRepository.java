package com.telerikacademy.demo.repositories;

import com.telerikacademy.demo.models.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCarRepository implements CarRepository {
    private List<Car> cars = new ArrayList<>();

    public InMemoryCarRepository() {
        cars.add(new Car(1,"BMV", "640",313,4000));
        cars.add(new Car(2, "Audi", "S5",354,4200));
        cars.add(new Car(3, "mercedes-Benz", "S600",525,5513));
    }

    @Override
    public void createStudent(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public Car getCarById(int id) {
        return getCar(id);
    }

    private Car getCar(int id) {
        return cars.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void updateCar(int id, Car car) {
        Car c = getCar(id);
        int index = cars.indexOf(c);
        cars.set(index, car);
    }

    @Override
    public void deleteCar(int id) {
        Car c = getCar(id);
        cars.remove(c);
    }
}
