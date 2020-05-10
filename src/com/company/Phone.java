package com.company;

public class Phone {
    String producer;
    String model;
    Double screenSize;

    public String toString() {
        return "Phone " + this.producer + " " + this.model + " " + this.screenSize;
    }
}
