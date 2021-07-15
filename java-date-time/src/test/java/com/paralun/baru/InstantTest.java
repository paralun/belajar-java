package com.paralun.baru;

import org.junit.jupiter.api.Test;

import java.time.*;

public class InstantTest {

    @Test
    void testInstantTest() {
        Instant instant1 = Instant.now();
        Instant instant2 = Instant.ofEpochMilli(System.currentTimeMillis());

        System.out.println(instant1);
        System.out.println(instant2);
    }

    @Test
    void testKonversi() {
        Instant instant = Instant.now();
        LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.of("Asia/Jakarta"));
        LocalTime localTime = LocalTime.ofInstant(instant, ZoneId.of("Asia/Jakarta"));
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("Asia/Jakarta"));

        System.out.println(instant);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
    }
}
