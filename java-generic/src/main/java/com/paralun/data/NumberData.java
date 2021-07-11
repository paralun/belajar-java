package com.paralun.data;

public class NumberData<T extends Number> {

    private T data;

    public NumberData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
