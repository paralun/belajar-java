package com.paralun;

import com.paralun.util.ConnectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchTest {

    @Test
    void testBatch() {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            String sql = "INSERT INTO users(username, password) VALUES(?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            for (int i = 1; i <= 10; i++) {
                statement.clearParameters();
                statement.setString(1, "guest");
                statement.setString(2, "guest123");
                statement.addBatch();
            }

            statement.executeBatch();

            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}
