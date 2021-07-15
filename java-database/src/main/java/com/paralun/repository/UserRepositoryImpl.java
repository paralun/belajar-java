package com.paralun.repository;

import com.paralun.model.User;
import com.paralun.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public void insert(User user) {
        try (Connection connection = ConnectionUtil.getDataSource().getConnection()) {
            String sql = "INSERT INTO users(username, password) VALUES(?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getPassword());
                statement.executeUpdate();
            }
        }catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void update(User user, Integer id) {
        try (Connection connection = ConnectionUtil.getDataSource().getConnection()) {
            String sql = "UPDATE users SET username = ?, password = ? WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getPassword());
                statement.setInt(2, id);
                statement.executeUpdate();
            }
        }catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void delete(Integer id) {
        try (Connection connection = ConnectionUtil.getDataSource().getConnection()) {
            String sql = "DELETE FROM users WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                statement.executeUpdate();
            }
        }catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Optional<User> findById(Integer id) {
        try (Connection connection = ConnectionUtil.getDataSource().getConnection()) {
            String sql = "SELECT * FROM users WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                try (ResultSet result = statement.executeQuery()) {
                    if (result.next()) {
                        User user = new User();
                        user.setId(result.getInt("id"));
                        user.setUsername(result.getString("username"));
                        user.setPassword(result.getString("password"));
                        return Optional.of(user);
                    }else {
                        return Optional.empty();
                    }
                }
            }
        }catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public List<User> findAll() {
        try (Connection connection = ConnectionUtil.getDataSource().getConnection()) {
            String sql = "SELECT * FROM users";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet result = statement.executeQuery()) {
                    List<User> users = new ArrayList<>();
                    while (result.next()) {
                        User user = new User();
                        user.setId(result.getInt("id"));
                        user.setUsername(result.getString("username"));
                        user.setPassword(result.getString("password"));
                        users.add(user);
                    }
                    return users;
                }
            }
        }catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
