package com.paralun.object;

public class PersonApp {
    public static void main(String[] args) {
        // Create Object
        Person person = new Person();
        person.firstName = "James";
        person.lastName = "Kusmambang";
        person.sayHello();

        Person person1 = new Person("Dina", "Nuraini");
        person1.sayHello();
    }
}
