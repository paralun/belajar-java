package com.paralun.enums;

public class EnumApp {
    public static void main(String[] args) {
        Level level = Level.HIGH;
        System.out.println(level);

        switch (level) {
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }

        // For Each Enums
        for (Level myLevel : Level.values()) {
            System.out.println(myLevel);
        }

        Level2 level2 = Level2.PREMIUM;
        System.out.println(level2);
        System.out.println(level2.getDescription());


        // Konversi Enum
        String levelString = Level.LOW.name();
        Level levelVal = Level.valueOf("MEDIUM");
        System.out.println(levelString);
        System.out.println(levelVal);
    }
}
