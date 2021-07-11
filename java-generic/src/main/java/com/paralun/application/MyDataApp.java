package com.paralun.application;

import com.paralun.data.MyData;

public class MyDataApp {
    public static void main(String[] args) {
        MyData<String> data1 = new MyData<>("Generic");
        System.out.println(data1.getData());

        MyData<Integer> data2 = new MyData<>(60);
        System.out.println(data2.getData());
    }
}
