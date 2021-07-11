package com.paralun.application;

import com.paralun.data.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        printData(new MyData<>("My Data"));
        printData(new MyData<>(20));
        printData(new MyData<>(true));
    }

    static void printData(MyData<?> data) {
        System.out.println(data.getData());
    }
}
