package com.paralun.legacy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

    @Test
    void testDate() {
        Date now1 = new Date();
        Date now2 = new Date(System.currentTimeMillis());
        Date custom = new Date(656145020000L);

        System.out.println(now1);
        System.out.println(now2);
        System.out.println(custom);
    }

    @Test
    void testDateFormat() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String value = dateFormat.format(date);
        System.out.println(value);
    }

    @Test
    void testImportantMethod() {
        Date now = new Date(System.currentTimeMillis());
        Date custom = new Date(656145020000L);

        boolean after = now.after(custom);
        boolean before = now.before(custom);

        // -1: now < custom
        // 0: now == custom
        // 1: now > custom
        int compare = now.compareTo(custom);

        Assertions.assertTrue(after);
        Assertions.assertFalse(before);
        Assertions.assertEquals(1, compare);
    }

    @Test
    void testParseDate() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = dateFormat.parse("12-05-2009");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
