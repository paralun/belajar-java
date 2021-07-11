package com.paralun.application;

public class MultipleBoundedApp {
    public static void main(String[] args) {
        Data<VicePresident> presidentData = new Data<>(new VicePresident());

        // Error karena tidak implement CanSayHello
        // Data<Manager> managerData = new Data<Manager>(new Manager());
    }
}

interface CanSayHello {
    void sayHello(String name);
}

abstract class Employee {

}

class Manager extends Employee {

}

class VicePresident extends Employee implements CanSayHello {

    @Override
    public void sayHello(String name) {
        System.out.println("Hallo " + name);
    }
}

class Data<T extends Employee & CanSayHello> {
    private T data;

    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
