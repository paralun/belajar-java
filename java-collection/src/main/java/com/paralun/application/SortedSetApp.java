package com.paralun.application;

import com.paralun.data.Person;
import com.paralun.data.PersonComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        //ASC
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        // DESC
        //SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Uned", "Bandung", 20));
        people.add(new Person("Agus", "Cianjur", 40));
        people.add(new Person("Zakaria", "Sukabumi", 15));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
