package com.paralun.application;

import com.paralun.data.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("My Data");

        // Saat compile tidak error, namun waktu dijalan kan akan terjadi error
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
