package com.paralun;

import com.paralun.util.ConnectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class DateTest {

    @Test
    void testInsertDate() {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();

            String sql = "INSERT INTO sample_time(sample_date, sample_time, sample_timestamp) VALUES(?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDate(1, new Date(System.currentTimeMillis()));
            statement.setTime(2, new Time(System.currentTimeMillis()));
            statement.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            statement.executeUpdate();

            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void testQueryDate()  {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();

            String sql = "SELECT * FROM sample_time";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                System.out.println(result.getInt("id"));
                System.out.println(result.getDate("sample_date"));
                System.out.println(result.getTime("sample_time"));
                System.out.println(result.getTimestamp("sample_timestamp"));
            }

            result.close();
            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}
