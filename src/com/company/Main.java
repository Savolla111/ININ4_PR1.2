package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.net.MalformedURLException;

public class Main {

    public static void main(String[] args) throws Exception, MalformedURLException {

        Animal dog = new Animal("Dog") {
            @Override
            public void feed(Double foodWeight) {

            }
        };
        dog.name = "Szarik";

        System.out.println("Hi, I'm " + dog.name);



        Human me = new Human();
        me.firstName = "Adrian";
        me.lastName = "Warda";
        me.pet = dog;
        me.phone = new Phone ("X","Apple",5.8);


        System.out.println(me.pet.species);

        me.pet = new Animal("Lion") {
            @Override
            public void feed(Double foodWeight) {

            }
        };
        me.pet.name = "Myszojeleń";


        System.out.println(me.pet.species);


        Animal cat = new Animal("cat") {
            @Override
            public void feed(Double foodWeight) {

            }
        };

        me.setSalary(3500.0);
        System.out.println("Your salary after increase " + me.getSalary() +" New data has been sent to the accounting system ,remember to pick up the annex from the contract and do not hide the income zus already knows.");


        System.out.println(me.getCar(2).model + " " + me.getCar(2).producer);

        Phone phone = new Phone("X","Apple",5.8);

        Car car = new Car("Focus", "Ford") {
            @Override
            public void refuel() {

            }
        };

        System.out.println(dog);
        System.out.println(me);

        car.turnOn();
        phone.turnOn();

        Human friend = new Human();
        friend.setSalary(1000.0);
        friend.firstName = "Jan";
        friend.lastName = "Nowak";

        cat.sell(me, friend, 999.0);

        System.out.println(me.getCar(2));
        System.out.println(me.cash);
        System.out.println(friend.getCar(2));
        System.out.println(friend.cash);

        FarmAnimal horse = new FarmAnimal("horse");
        horse.beEaten();

        /*me.phone.installAnApp("Messanger");
        me.phone.installAnApp("Messanger","1.0.1");*/
    }
}
