package com.paralun.baru;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneTest {

    @Test
    void testZoneId() {
        ZoneId zoneId1 = ZoneId.systemDefault();
        ZoneId zoneId2 = ZoneId.of("GMT");
        Set<String> listZone = ZoneId.getAvailableZoneIds();

        System.out.println(zoneId1);
        System.out.println(zoneId2);
        listZone.forEach(System.out::println);
    }

    @Test
    void testZoneOffset() {
        ZoneOffset zoneOffset1 = ZoneOffset.of("+07:00");
        ZoneOffset zoneOffset2 = ZoneOffset.ofHours(-7);
        ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(5, 30);

        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
        System.out.println(zoneOffset3);
    }

    @Test
    void testZoneDateTime() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime3 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Jakarta"));
        ZonedDateTime zonedDateTime4 = ZonedDateTime.now(ZoneOffset.ofHours(5));

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
        System.out.println(zonedDateTime4);
    }

    @Test
    void testChangeZone() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = zonedDateTime1.withZoneSameLocal(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime3 = zonedDateTime1.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }
}
