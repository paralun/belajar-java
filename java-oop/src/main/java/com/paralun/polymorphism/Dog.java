package com.paralun.polymorphism;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("The dog says: Guk.. Guk..");
    }
}
