package com.company;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
    private Double salary = 3000.00;

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
}