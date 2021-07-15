package com.paralun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

    @BeforeAll
    static void registerDriver() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void testConnection() {
        String url = "jdbc:mysql://localhost:3306/belajar_db";
        String username = "latihan";
        String password = "latihan";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Success");
            connection.close();
            System.out.println("Connection Close");
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}
