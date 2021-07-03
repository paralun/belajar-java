package com.paralun.basic;

public class ForLoop {
    public static void main(String[] args) {
        // Infinity loop
//        for (;;) {
//            System.out.println("Tanpa Henti");
//        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("Perulanagan ke " + i);
        }

        // for-each
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

        // Break
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }

            System.out.println("Perulanagan ke " + i);
        }

        // Continue
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                continue;
            }

            System.out.println("Perulanagan ke " + i);
        }
    }
}
