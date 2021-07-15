package com.paralun;

import com.paralun.util.ConnectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class PreparedStatementTest {

    @Test
    void testSqlInjectionClose()  {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();

            String username = "admin'; #";
            String password = "salah";
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet result = statement.executeQuery();

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

    @Test
    void testInsert()  {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();

            String sql = "INSERT INTO users(username, password) VALUES(?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "guest");
            statement.setString(2, "guest123");
            statement.executeUpdate();

            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void testGetAutoGenerateKey()  {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();

            String sql = "INSERT INTO users(username, password) VALUES(?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, "presiden");
            statement.setString(2, "presiden123");
            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                int id = result.getInt(1);
                System.out.println(id);
            }

            result.close();
            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}
