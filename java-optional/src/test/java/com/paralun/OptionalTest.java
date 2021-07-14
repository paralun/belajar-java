package com.paralun;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    void testGet() {
        String name = Optional.ofNullable("James").get();
        assertEquals("James", name);
    }

    @Test
    void testOrElse() {
        String param = null;
        // Bersifat Eager
        String name = Optional.ofNullable(param).orElse("Kosong");
        assertEquals("Kosong", name);
    }

    @Test
    void testOrElseGet() {
        String param = null;
        // Bersifat Lazy
        String name = Optional.ofNullable(param).orElseGet(() -> "Null");
        assertEquals("Null", name);
    }

    @Test
    void testIfPresent() {
        String param = null;
        Optional.ofNullable(param).ifPresent(value -> System.out.println(value));
    }

    @Test()
    void testOrElseThrow() {
        String param = null;
        assertThrows(IllegalArgumentException.class, () -> {
            Optional.ofNullable(param).orElseThrow(IllegalArgumentException::new);
        });
    }

}
