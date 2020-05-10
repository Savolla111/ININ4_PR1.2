package com.company;

import java.io.File;

public class Animal implements Saleable {
    final String species;
    String name;
    File pic;
    protected Double weight;


    public Animal(String species) {
        this.species = species;
        if (species == "Dog") {
            weight = 10.0;
        } else if (species == "Lion") {
            weight = 180.0;
        } else {
            weight = 1.0;
        }

    }

    void feed() {
        if (weight <= 0) {
            System.out.println("U can't feed dead pet");
        } else {
            weight += 0.1;
            System.out.println("Thx bro, my weight is now " + weight);
        }
    }

    void takeForAWalk() {
        if (weight <= 0) {
            System.out.println("U can't go for a walk with dead pet");
        } else {
            weight -= 1;
            System.out.println("Thx for a walk, my weight is now " + weight);
        }
    }

    public String toString() {
        return this.species + " " + this.name;
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("no way");
        } else {
            if (buyer.cash >= price) {
                seller.cash += price;
                buyer.cash -= price;
                buyer.pet = this;
                if (seller.pet == this) {
                    seller.pet = null;
                }
                System.out.println(buyer.firstName + " bought " + this.toString() + " from " + seller.firstName + " for " + price);
            } else {
                throw new Exception("sorry, you have not enough money");
            }
        }
    }
}
