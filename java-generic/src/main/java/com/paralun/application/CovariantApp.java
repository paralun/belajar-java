package com.paralun.application;

import com.paralun.data.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> data = new MyData<>("James Kusmambang");

        // Membuat Covariant
        MyData<? extends Object> covariant = data;

        // Tidak bisa merubah datanya, karena bersifat read-only
        //covariant.setData("Tidak bisa diubah");

        System.out.println(covariant.getData());
    }
}
