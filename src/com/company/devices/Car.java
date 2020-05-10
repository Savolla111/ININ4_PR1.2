package com.company.devices;

import com.company.Human;
import com.company.Saleable;

public class Car extends Device  implements Saleable {
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

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        try {
            super.sell(seller, buyer, price);
            buyer.setCar(this);
            if (seller.getCar() == this) {
                seller.setCar(null);
            }
        } catch (Exception e) {
            System.out.println("transaction aborted");
            throw e;
        }
    }
}
