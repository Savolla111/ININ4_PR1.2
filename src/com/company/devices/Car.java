package com.company.devices;

public class Car extends Device {
    String color;
    public String model;
    public String producer;
    public Double value = 10000.0;

    public Car(String model, String producer) {
        super(producer,model);
    }

    public String toString() {
        return "Car " + this.producer + " " + this.model + " " + this.color;
    }

    public void turnOn() {
        System.out.println("turn on Car");
    }
}
