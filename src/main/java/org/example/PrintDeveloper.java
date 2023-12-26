package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrintDeveloper {
    private static final String SELECT_ALL_DEVELOPERS = "SELECT * FROM developers";

    public List<Developer> getAllDevelopers() {
        List<Developer> developers = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_DEVELOPERS);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String specialty = resultSet.getString("specialty");
                double salary = resultSet.getDouble("salary");

                developers.add(new Developer(id, name, specialty, salary));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return developers;
    }
}