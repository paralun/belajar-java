package com.paralun.baru;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

    @Test
    void testLocalDateTime() {
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.of(2019, 2, 20, 20, 10, 40);
        LocalDateTime dateTime3 = LocalDateTime.parse("2019-01-03T10:20:11");

        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime3);
    }

    @Test
    void testLocalDateTime_toLocalDate() {
        LocalDateTime dateTime1 = LocalDateTime.now();

        LocalDate localDate = dateTime1.toLocalDate();

        System.out.println(localDate);
    }

    @Test
    void testLocalDateTime_toLocalTime() {
        LocalDateTime dateTime1 = LocalDateTime.now();

        LocalTime localTime = dateTime1.toLocalTime();

        System.out.println(localTime);
    }

    @Test
    void testLocalDate_toLocalDateTime() {
        LocalDate localDate = LocalDate.now();

        LocalDateTime dateTime = localDate.atTime(19, 20, 50);

        System.out.println(dateTime);
    }

    @Test
    void testLocalTime_toLocalDateTime() {
        LocalTime localTime = LocalTime.now();

        LocalDateTime dateTime = localTime.atDate(LocalDate.now());

        System.out.println(dateTime);
    }
}
