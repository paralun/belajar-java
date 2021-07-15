package com.paralun.repository;

import com.paralun.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    void insert(User user);
    void update(User user, Integer id);
    void delete(Integer id);
    Optional<User> findById(Integer id);
    List<User> findAll();
}
