package com.paralun.foreach;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        // for loop
        for (Integer value : list) {
            System.out.println(value);
        }

        System.out.println("==================");

        // for each anonymous class
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.println(value);
            }
        });

        // Lambda
        list.forEach(value -> System.out.println(value));

        list.forEach(System.out::println);

    }
}
