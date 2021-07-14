package com.paralun;

import com.paralun.data.User;
import com.paralun.data.UserService;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class UserTest {

    @Test
    void testUser_IFPresent() {
        User user = new User(1, "Kusmambang", "Active");
        Optional<User> optional = Optional.ofNullable(user);
        optional.ifPresent(value -> System.out.println(value.getName()));
    }

    @Test
    void testUser_Get() {
        UserService service = new UserService();
        User user = service.getUser().get();
        System.out.println(user);
    }

    @Test
    void testUser_Filter() {
        UserService service = new UserService();
        service.getUser()
                .filter(name -> name.getStatus().equalsIgnoreCase("Active"))
                .ifPresent(System.out::println);
    }
}
