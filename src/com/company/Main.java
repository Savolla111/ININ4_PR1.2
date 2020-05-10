package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

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

        Phone phone = new Phone("X","Apple",5.8);

        Car car = new Car("Focus","Ford");

        System.out.println(dog);
        System.out.println(me);

        car.turnOn();
        phone.turnOn();

        Human friend = new Human();
        friend.setSalary(1000.0);
        friend.firstName = "Jan";
        friend.lastName = "Nowak";

        cat.sell(me, friend, 999.0);

        System.out.println(me.getCar());
        System.out.println(me.cash);
        System.out.println(friend.getCar());
        System.out.println(friend.cash);


    }
}
