package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        dog.name = "Szarik";

        System.out.println("Hi, I'm " + dog.name);

        dog.feed();

        Human me = new Human();
        me.firstName = "Adrian";
        me.lastName = "Warda";
        me.pet = dog;

        me.pet.feed();
        System.out.println(me.pet.species);

        me.pet = new Animal("Lion");
        me.pet.name = "Myszojeleń";

        me.pet.feed();

        System.out.println(me.pet.species);


        Animal cat = new Animal("cat");
        cat.feed();
        for (int i = 10; i < 14; i++) {
            cat.takeForAWalk();
        }
        cat.feed();

        me.setSalary(3500.0);
        System.out.println("Your salary after increase " + me.getSalary() +" New data has been sent to the accounting system ,remember to pick up the annex from the contract and do not hide the income zus already knows.");

        me.setCar(new Car("Ford", "Focus"));
        System.out.println(me.getCar().model + " " + me.getCar().producer);
    }
}
