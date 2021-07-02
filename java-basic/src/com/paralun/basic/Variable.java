package com.paralun.basic;

public class Variable {
    public static void main(String[] args) {
        // Keyword final
        final String NIK = "22334455667788";

        String name = "James Kusmambang";

        String address;
        address = "Jl. Yang Penting Sampai";

        int age = 17;

        System.out.println(name);
        System.out.println(address);
        System.out.println(age);

        //Merubah value variable
        name = "Nama sudah di ubah";
        System.out.println(name);

        //Keyword Var (Tersedia sejak versi Java 10)
        var hobby = "Lagi di cari";
        var no = 39;

        System.out.println(hobby);
        System.out.println(no);
    }
}
