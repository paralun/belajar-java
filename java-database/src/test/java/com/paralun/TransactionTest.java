package com.paralun;

import com.paralun.util.ConnectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionTest {

    @Test
    void testTransaction() {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            connection.setAutoCommit(false);

            String sql = "INSERT INTO users(username, password) VALUES(?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "guest");
            statement.setString(2, "guest123");
            statement.executeUpdate();

            statement.close();

            connection.commit();
            //connection.rollback();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}
