package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

public class Device implements Saleable {
    String producer;
    String model;

    public Device(String producer, String model) {
    }

    public String toString() {
        return "Device: " + " Model: " + model + " Producer: " + producer;
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash >= price) {
            seller.cash += price;
            buyer.cash -= price;
            System.out.println(buyer.firstName + " bought " + this.toString() + " from " + seller.firstName + " for " + price);
        } else {
            throw new Exception("sorry, you have not enough money");
        }
    }
}

