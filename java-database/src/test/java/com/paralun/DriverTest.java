package com.paralun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverTest {

    @Test
    void testDriver() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}
