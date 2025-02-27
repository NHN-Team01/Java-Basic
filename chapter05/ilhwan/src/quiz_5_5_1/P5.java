package com.nhnacademy.quiz_5_5_1;

public class P5 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Truck()};

        for(Vehicle vehicle : vehicles) {
            if(vehicle instanceof Car) {
                System.out.println("This is a car.");
            } else if(vehicle instanceof Truck) {
                System.out.println("This is a truck.");
            }
            vehicle.printType();
        }
    }
}

class Vehicle {
    public void printType() {
        System.out.println("Generic Vehicle");
    }
}

class Car extends Vehicle {
    public void printType() {
        System.out.println("Car");
    }
}

class Truck extends Vehicle {
    public void printType() {
        System.out.println("Truck");
    }
}