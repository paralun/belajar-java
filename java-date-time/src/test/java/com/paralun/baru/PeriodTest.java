package com.paralun.baru;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    @Test
    void testPeriod() {
        Period period1 = Period.ofDays(2);
        Period period2 = Period.ofWeeks(2);
        Period period3 = Period.ofMonths(2);
        Period period4 = Period.ofYears(2);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
    }

    @Test
    void testPeriod_Get() {
        Period period = Period.of(10, 10, 10);

        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
    }

    @Test
    void testPeriod_Between() {
        Period period = Period.between(LocalDate.of(1991, 8, 24), LocalDate.now());

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
