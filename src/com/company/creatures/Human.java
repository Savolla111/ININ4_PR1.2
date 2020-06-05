package com.company.creatures;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private static final Integer DEFAULT_GARAGE_SIZE = 2;
    private Car[] garage;
    private Double salary = 3000.00;
    public Double cash;


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary < 0){
            System.out.println("Sorry, you must earn something");
        } else{
            System.out.println("Your salary is now: " +getSalary());
            this.salary = salary;
        }
    }

    public Car getCar(Integer index) {
        return garage[index];
    }

    public void setCar(Car car, Integer index) {
        this.garage[index] = car;
    }

    public Car[] getGarage() {
        return this.garage;
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }

    public Human() {
        super("homo sapiens");
        this.weight = 80.0;
        this.cash = 10000.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer farmSize, Integer garageSize) {

        super("homo sapiens");
        this.weight = 80.0;
        this.cash = 10000.0;
        this.garage = new Car[garageSize];
    }

    public void sell() throws Exception {
        throw new Exception("You can't sell people");
    }

    @Override
    public void feed(Double foodWeight) {

    }

    public double valueOfCars() {
        Double sum = 0.0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.value;
            }
        }
        return sum;
    }
}
