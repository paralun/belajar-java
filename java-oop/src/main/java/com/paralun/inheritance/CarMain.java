package com.paralun.inheritance;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.brand + " " + car.model);

        car.honk();

    }
}
