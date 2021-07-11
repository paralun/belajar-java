package com.paralun.application;

import com.paralun.data.MyData2;

public class MyData2App {
    public static void main(String[] args) {
        MyData2<String, String> name = new MyData2<>("James", "Kusmambang");
        System.out.println(name.getFirst());
        System.out.println(name.getSecond());

        MyData2<Integer, String> data = new MyData2<>(10, "Data");
        System.out.println(data.getFirst());
        System.out.println(data.getSecond());
    }
}
