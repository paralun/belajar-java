package com.paralun.baru;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    void testLocalTime() {
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(18, 20, 40);
        LocalTime localTime3 = LocalTime.parse("17:09");

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }
}
