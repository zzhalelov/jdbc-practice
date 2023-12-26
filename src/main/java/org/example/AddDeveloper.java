package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddDeveloper {
    private static final String INSERT_DEVELOPER = "INSERT INTO developers (name, specialty, salary) VALUES (?, ?, ?)";

    public void addDeveloper(String name, String specialty, double salary) {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DEVELOPER)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, specialty);
            preparedStatement.setDouble(3, salary);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}