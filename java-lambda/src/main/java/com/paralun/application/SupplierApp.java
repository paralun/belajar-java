package com.paralun.application;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "James Kusmambang";

        System.out.println(supplier.get());
    }
}
