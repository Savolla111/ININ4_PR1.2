package com.company;

public class Car {
    String color;
    final String model;
    final String producer;
    public Double value = 10000.0;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String toString() {
        return "Car " + this.producer + " " + this.model + " " + this.color;
    }
}
