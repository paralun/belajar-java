package com.paralun.baru;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

    @Test
    void testLocalDate() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2009, Month.FEBRUARY, 17);
        LocalDate localDate3 = LocalDate.parse("2019-01-02");

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void testLocalDate_with() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.withYear(2018);
        LocalDate localDate3 = localDate1.withYear(2019).withMonth(8).withDayOfMonth(20);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void testLocalDate_modify() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.plusYears(2);
        LocalDate localDate3 = localDate1.minusYears(3);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void testLocalDate_get() {
        LocalDate localDate1 = LocalDate.now();

        System.out.println(localDate1.getYear());
        System.out.println(localDate1.getMonth());
        System.out.println(localDate1.getMonthValue());
        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate1.getDayOfWeek());
        System.out.println(localDate1.getDayOfYear());
    }
}
