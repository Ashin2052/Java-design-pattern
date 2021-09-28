package com.practice.model;

public interface AbstractFactory <T>{
    T create(String animalType);
}
