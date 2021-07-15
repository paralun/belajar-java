package com.paralun;

import com.paralun.repository.UserRepository;
import com.paralun.repository.UserRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RepositoryTest {

    private UserRepository repository;

    @BeforeEach
    void setup() {
        repository = new UserRepositoryImpl();
    }

    @Test
    void testFindById() {
        repository.findById(3).ifPresent(System.out::println);
    }

    @Test
    void testFindAll() {
        repository.findAll().forEach(System.out::println);
    }
}
