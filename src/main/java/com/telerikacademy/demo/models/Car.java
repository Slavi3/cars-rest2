package com.telerikacademy.demo.models;

public class Car {
    private int id;
    private String make;

    private String model;
    private int power;
    private int cubicCapacity;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCubicCapcity() {
        return cubicCapacity;
    }

    public void setCubicCapcity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }




    public Car() {
    }

    public Car(int id, String make, String model, int power, int cubicCapacity) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.power = power;
        this.cubicCapacity = cubicCapacity;
    }
}
