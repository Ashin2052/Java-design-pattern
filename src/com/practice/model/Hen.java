package com.practice.model;

public class Hen implements Animal{
    @Override
    public void eat() {
        System.out.println("hen eats grain");
    }

    @Override
    public void leg() {
        System.out.println("hen has two leg");
    }
}
