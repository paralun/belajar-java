package com.paralun.object;

public class Person {
    String firstName;
    String lastName;

    // Constructor
    public Person() {
    }

    // Constructor with parameter (Overloading)
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method
    void sayHello() {
        System.out.println("Hallo " + firstName + " " + lastName);
    }
}
