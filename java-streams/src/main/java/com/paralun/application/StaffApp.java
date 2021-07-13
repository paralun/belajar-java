package com.paralun.application;

import com.paralun.data.Staff;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StaffApp {
    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff(1, "James", 20, new BigDecimal("7000")),
                new Staff(2, "Agus", 28, new BigDecimal("5000")),
                new Staff(3, "Nia", 25, new BigDecimal("10000")),
                new Staff(4, "Siti", 19, new BigDecimal("3000"))
        );

        // Collect Staff Name
        List<String> names = staff.stream()
                .map(name -> name.getName())
                .collect(Collectors.toList());
        System.out.println(names);

        List<Staff> filterAge = staff.stream()
                .filter(value -> value.getAge() <= 20)
                .collect(Collectors.toList());
        System.out.println(filterAge);

        Staff first = staff.stream().findFirst().orElse(null);
        System.out.println(first);

        Comparator<Staff> comparator = Comparator.comparing(Staff::getName);

        List<Staff> sorted = staff.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
