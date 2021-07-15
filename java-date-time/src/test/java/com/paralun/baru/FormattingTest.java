package com.paralun.baru;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormattingTest {

    @Test
    void testParsing() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate localDate = LocalDate.parse("2009 09 09", timeFormatter);
        System.out.println(localDate);
    }

    @Test
    void testFormat() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate localDate = LocalDate.now();
        String value = localDate.format(timeFormatter);
        System.out.println(value);
    }

    @Test
    void testFormat_Indonesia() {
        Locale locale = new Locale("in", "ID");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);
        LocalDate localDate = LocalDate.now();
        String value = localDate.format(timeFormatter);
        System.out.println(value);
    }
}
