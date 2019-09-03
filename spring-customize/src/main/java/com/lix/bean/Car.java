package com.lix.bean;

public class Car {
    public Car() {
        System.out.println("This is a constructor method,a car is being created");
    }

    public void init() {
        System.out.println("the car initializing");
    }

    public void destroy() {
        System.out.println("the car's life is over");
    }
}
