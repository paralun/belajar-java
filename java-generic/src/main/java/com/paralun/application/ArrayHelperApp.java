package com.paralun.application;

import com.paralun.data.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"James", "Kusmambang"};
        Integer[] numbers = {2, 5, 7, 8, 20};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(numbers));
    }
}
