package com.paralun.polymorphism;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        animal = new Cat();
        animal.sound();

        animal = new Dog();
        animal.sound();

        getName(new Cat("Cat"));
        getName(new Dog("Dog"));

        getNameCasts(new Cat("Meong.."));
        getNameCasts(new Dog("Gug.."));
    }

    static void getName(Animal animal) {
        System.out.println(animal.getName());
    }

    static void getNameCasts(Animal animal) {
        if (animal instanceof Cat) {
            // conversion
            Cat cat = (Cat) animal;
            System.out.println("Hallo Cat: " + animal.getName());
        } else if(animal instanceof Dog) {
            // conversion
            Dog dog = (Dog) animal;
            System.out.println("Hallo Dog: " + animal.getName());
        }else {
            System.out.println(animal.getName());
        }
    }
}
