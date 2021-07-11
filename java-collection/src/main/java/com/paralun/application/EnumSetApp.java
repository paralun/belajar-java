package com.paralun.application;

import com.paralun.data.Level;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {
    public static void main(String[] args) {
        //Set<Level> levels = EnumSet.allOf(Level.class);
        Set<Level> levels = EnumSet.of(Level.HIGH, Level.MEDIUM);

        for (var level : levels) {
            System.out.println(level);
        }
    }
}
