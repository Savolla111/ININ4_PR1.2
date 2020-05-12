package com.company.creatures;

import com.company.Saleable;

import java.io.File;

public abstract class Animal implements Saleable, Feedable {
    public final String species;
    public String name;
    File pic;
    protected Double weight;

    public Animal(String species) {
        this.species = species;
        this.weight = weight;
        }

    public void feed() {
        feed(1.0);
    }


    public void feed(double foodWeight) {
        if (weight <= 0) {
            System.out.println("U can't feed dead pet");
        } else {
            weight += foodWeight;
            System.out.println("Thx bro, my weight is now " + this.weight);
        }
    }

    public void takeForAWalk() {
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
