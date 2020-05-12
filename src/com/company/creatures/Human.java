package com.company.creatures;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Car car;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(car.value <= this.salary){
            System.out.println("You bought car by cash");
            this.car = car;
        } else if (car.value <= this.salary * 12){
            System.out.println("you bought car on credit");
            this.car = car;
        }else {
            System.out.println("Sorry, find better job if you want car");
        }
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }

    public Human() {
        super("homo sapiens");
        this.weight = 80.0;
        this.cash = 10000.0;
    }

    public void sell() throws Exception {
        throw new Exception("You can't sell people");
    }

    @Override
    public void feed(Double foodWeight) {

    }
}