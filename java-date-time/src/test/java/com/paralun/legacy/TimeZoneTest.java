package com.paralun.legacy;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneTest {

    @Test
    void testTimeZone() {
        TimeZone timeZone1 = TimeZone.getDefault();
        TimeZone timeZone2 = TimeZone.getTimeZone("Asia/Jakarta");
        String[] listTimeZone = TimeZone.getAvailableIDs();

        System.out.println(timeZone1);
        System.out.println(timeZone2);
        for (String value : listTimeZone) {
            System.out.println(value);
        }
    }

    @Test
    void testTimeZoneDate() {
        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar2.get(Calendar.HOUR_OF_DAY));

        calendar1.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
    }
}
