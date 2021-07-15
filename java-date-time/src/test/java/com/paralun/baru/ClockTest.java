package com.paralun.baru;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ClockTest {

    @Test
    void testClock() {
        Clock clock1 = Clock.systemUTC();
        Clock clock2 = Clock.systemDefaultZone();
        Clock clock3 = Clock.system(ZoneId.of("Asia/Jakarta"));

        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);
    }

    @Test
    void testClock_Instant() {
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));
        Instant instant = clock.instant();

        System.out.println(instant);
    }

    @Test
    void testClock_Konversi() {
        Clock clock = Clock.systemDefaultZone();
        LocalDate localDate = LocalDate.now(clock);
        LocalTime localTime = LocalTime.now(clock);
        LocalDateTime localDateTime = LocalDateTime.now(clock);
        OffsetTime offsetTime = OffsetTime.now(clock);
        OffsetDateTime offsetDateTime = OffsetDateTime.now(clock);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(clock);

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(offsetTime);
        System.out.println(offsetDateTime);
        System.out.println(zonedDateTime);
    }
}
