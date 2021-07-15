package com.paralun;

import com.paralun.util.ConnectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

    @Test
    void testCreateStatement()  {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            Statement statement = connection.createStatement();

            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void testInsert()  {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            Statement statement = connection.createStatement();

            String sql = "INSERT INTO users(username, password) VALUES('admin', 'admin123')";

            statement.executeUpdate(sql);

            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void testUpdate()  {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            Statement statement = connection.createStatement();

            String sql = "UPDATE users SET password = 'admin555' WHERE id = 3";

            statement.executeUpdate(sql);

            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void testDelete()  {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            Statement statement = connection.createStatement();

            String sql = "DELETE FROM users WHERE id = 3";

            statement.executeUpdate(sql);

            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void testQuery()  {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM users WHERE id = 2";

            ResultSet result = statement.executeQuery(sql);

            if (result.next()) {
                Integer id = result.getInt("id");
                String username = result.getString("username");
                String password = result.getString("password");

                System.out.println(String.join(",", String.valueOf(id), username, password));
            }

            result.close();
            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void testQueryAll()  {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM users";

            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Integer id = result.getInt("id");
                String username = result.getString("username");
                String password = result.getString("password");

                System.out.println(String.join(",", String.valueOf(id), username, password));
            }

            result.close();
            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void testSqlInjection()  {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            Statement statement = connection.createStatement();

            String username = "admin'; #";
            String password = "salah";
            String sql = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
            System.out.println(sql);

            ResultSet result = statement.executeQuery(sql);

            if (result.next()) {
                System.out.println("Login Success");
            }else {
                System.out.println("Login Failed");
            }

            result.close();
            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}
