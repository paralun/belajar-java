package com.paralun.standard;

import java.util.UUID;

public class UUIDClass {
    public static void main(String[] args) {
        for (var i = 1; i <= 10; i++) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid.toString());
        }
    }
}
