package com.paralun.application;

import com.paralun.data.Level;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {
    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.LOW, "Rendah");
        map.put(Level.MEDIUM, "Sedang");
        map.put(Level.HIGH, "Tinggi");

        System.out.println(map.get(Level.MEDIUM));
    }
}
