package com.paralun.data;

import java.util.Optional;

public class UserService {

    public Optional<User> getUser() {
        return Optional.of(new User(1, "Ahmad", "Active"));
    }
}
