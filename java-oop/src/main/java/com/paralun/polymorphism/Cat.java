package com.paralun.polymorphism;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("The cat says: Meong...");
    }
}
