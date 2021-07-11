package com.paralun.application;

import com.paralun.data.NumberData;

public class BoundedApp {
    public static void main(String[] args) {
        NumberData<Integer> numInt = new NumberData<>(40);
        NumberData<Double> numDouble = new NumberData<>(90.5);

        // Error, karena String bukan turunan Number
        // NumberData<String> errorType = new NumberData<String>("Error");

        System.out.println(numInt.getData());
        System.out.println(numDouble.getData());
    }
}
