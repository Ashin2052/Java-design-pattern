package com.practice.model;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            System.out.println("dog");
        } else if ("Hen".equalsIgnoreCase(animalType)) {
            System.out.println("hen");
        }
        return null;
    }
}
