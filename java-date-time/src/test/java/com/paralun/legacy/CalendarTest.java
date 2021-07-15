package com.paralun.legacy;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    @Test
    void testCalendar() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);
    }

    @Test
    void testCalendarModify() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2007);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 13);

        Date date = calendar.getTime();
        System.out.println(date);
    }

    @Test
    void testGetCalendar() {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MILLISECOND));

        System.out.println(calendar.getMaximum(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.getMaximum(Calendar.WEEK_OF_YEAR));

    }

    @Test
    void testCalendar_Add() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 5);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.MONTH, 2);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR, 2);
        System.out.println(calendar.getTime());

    }
}
