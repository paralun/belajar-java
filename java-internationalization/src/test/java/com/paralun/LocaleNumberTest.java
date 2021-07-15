package com.paralun;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleNumberTest {

    @Test
    void testNumber() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        String value = numberFormat.format(1234550.678);
        System.out.println(value);
    }

    @Test
    void testNumberLocale() {
        Locale locale = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        String value = numberFormat.format(1234550.678);
        System.out.println(value);
    }
}
