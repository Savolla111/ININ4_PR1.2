package com.company.devices;

public class Device {
    String producer;
    String model;

    public Device(String producer, String model) {
    }

    public String toString() {
        return "Device: " +" Model: " + model + " Producer: " + producer;
    }
}
