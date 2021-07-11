package com.paralun.application;

import com.paralun.data.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> myData = new MyData<Object>("James");

        // Contravariant
        MyData<? super String> myData1 = myData;
        myData1.setData("James Kusmambang");

        System.out.println(myData.getData());
        System.out.println(myData1.getData());
    }
}
