package com.company.devices;

public class Phone extends Device {
    Double screenSize;

    public Phone(String model, String producer, double screenSize) {
        super(producer, model);
        this.screenSize = screenSize;
    }

    public String toString() {
        return "Phone " + this.producer + " " + this.model + " " + this.screenSize;
    }
    public void turnOn() {
        System.out.println("turn on Phone");
    }
}
