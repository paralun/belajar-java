package com.paralun.baru;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {

    @Test
    void testDuration() {
        Duration duration1 = Duration.ofSeconds(10);
        Duration duration2= Duration.ofMinutes(10);
        Duration duration3 = Duration.ofHours(10);

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
    }

    @Test
    void testDuration_Get() {
        Duration duration = Duration.ofHours(24);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());

    }

    @Test
    void testDuration_Between() {
        Duration duration = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(20));
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());

    }
}
