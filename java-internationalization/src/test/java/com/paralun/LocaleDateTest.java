package com.paralun;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleDateTest {

    @Test
    void testDateFormat() {
        SimpleDateFormat format = new SimpleDateFormat("EEEE dd MMMM yyyy");
        String value = format.format(new Date());
        System.out.println(value);
    }

    @Test
    void testDateFormatLocale() {
        Locale locale = new Locale("in", "ID");
        SimpleDateFormat format = new SimpleDateFormat("EEEE dd MMMM yyyy", locale);
        String value = format.format(new Date());
        System.out.println(value);
    }
}
