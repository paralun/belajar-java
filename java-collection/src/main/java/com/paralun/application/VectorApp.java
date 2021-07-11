package com.paralun.application;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("James");
        list.add("Kusmambang");

        for (String name : list) {
            System.out.println(name);
        }
    }
}
