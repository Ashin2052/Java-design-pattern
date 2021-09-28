package com.practice.model;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("eat meat");
    }

    @Override
    public void leg() {
        System.out.println("4 leg");

    }
}
