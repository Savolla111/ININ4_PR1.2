package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Car extends Device  implements Saleable {
    String color;
    public String model;
    public String producer;
    public Double value = 10000.0;

    public List<Human> owners = new LinkedList<Human>();

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
            buyer.setCar(this,2);
            if (seller.getCar(2) == this) {
                seller.setCar(null,2);
            }
        } catch (Exception e) {
            System.out.println("transaction aborted");
            throw e;
        }
    }

    abstract public void refuel();

}
