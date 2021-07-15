package com.paralun.baru;

import org.junit.jupiter.api.Test;

import java.time.*;

public class YearTest {

    @Test
    void testYear() {
        // yyyy
        Year year1 = Year.now();
        Year year2 = Year.of(2018);
        Year year3 = Year.parse("2017");

        System.out.println(year1);
        System.out.println(year2);
        System.out.println(year3);
    }

    @Test
    void testYearMonth() {
        // yyyy-MM
        YearMonth yearMonth1 = YearMonth.now();
        YearMonth yearMonth2 = YearMonth.of(2019, Month.FEBRUARY);
        YearMonth yearMonth3 = YearMonth.parse("2020-10");

        System.out.println(yearMonth1);
        System.out.println(yearMonth2);
        System.out.println(yearMonth3);
    }

    @Test
    void testMonthDay() {
        // --MM-dd
        MonthDay monthDay1 = MonthDay.now();
        MonthDay monthDay2 = MonthDay.of(Month.AUGUST, 21);
        MonthDay monthDay3 = MonthDay.parse("--08-20");

        System.out.println(monthDay1);
        System.out.println(monthDay2);
        System.out.println(monthDay3);
    }

    @Test
    void konversi() {
        Year year = Year.now();
        LocalDate localDate = year.atMonth(Month.FEBRUARY).atDay(20);

        MonthDay monthDay = MonthDay.from(localDate);

        System.out.println(localDate);
        System.out.println(monthDay);

    }
}
