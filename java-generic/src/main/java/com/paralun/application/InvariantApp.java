package com.paralun.application;

import com.paralun.data.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> data = new MyData<>("Invariant");

        // Akan ERROR karena tidak boleh di subtitusi
        //MyData<Object> data2 = data;
    }
}
