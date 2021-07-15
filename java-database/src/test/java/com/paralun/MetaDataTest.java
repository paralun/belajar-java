package com.paralun;

import com.paralun.util.ConnectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class MetaDataTest {

    @Test
    void testDatabaseMetaData()  {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            DatabaseMetaData metaData = connection.getMetaData();

            System.out.println(metaData.getDatabaseProductName());
            System.out.println(metaData.getDatabaseProductVersion());

            ResultSet tables = metaData.getTables("belajar_db", null, null, null);
            while (tables.next()) {
                System.out.println(tables.getString("TABLE_NAME"));
            }

            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void testParameterMetaData() {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            String sql = "INSERT INTO users(username, password) VALUES(?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);

            ParameterMetaData metaData = statement.getParameterMetaData();

            System.out.println(metaData.getParameterCount());
            //System.out.println(metaData.getParameterType(1));
            //System.out.println(metaData.getParameterType(2));

            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void testResultSetMetaData() {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            String sql = "SELECT * FROM users";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet result = statement.executeQuery();

            ResultSetMetaData metaData = result.getMetaData();
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.println("Name: " + metaData.getColumnName(i));
                System.out.println("Type: " + metaData.getColumnType(i));
                System.out.println("Type Name: " + metaData.getColumnTypeName(i));

                if (metaData.getColumnType(i) == Types.INTEGER) {
                    System.out.println("TYPE INTEGER");
                }
            }

            result.close();
            statement.close();
            connection.close();
        }catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}
