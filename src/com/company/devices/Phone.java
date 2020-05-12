package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

public class Phone extends Device implements Saleable{
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

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        try {
            super.sell(seller, buyer, price);

            buyer.phone = this;
            if (seller.phone == this) {
                seller.phone = null;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
