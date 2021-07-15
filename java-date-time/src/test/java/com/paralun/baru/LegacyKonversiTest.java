package com.paralun.baru;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.util.Date;

public class LegacyKonversiTest {

    @Test
    void testLegacyToNew() {
        Date date = new Date();

        // -7
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("Asia/Jakarta"));

        System.out.println(instant);
        System.out.println(localDateTime);
    }

    @Test
    void testNewToLegacy() {
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = Date.from(localDateTime.toInstant(ZoneOffset.of("+07:00")));
        System.out.println(date);
    }
}
