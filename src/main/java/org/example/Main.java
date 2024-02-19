package org.example;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Class<Driver> driverClass = Driver.class;
        String str = "CREATE TABLE IF NOT EXISTS cars(" +
                "id INT PRIMARY KEY," +
                "name VARCHAR," +
                "speed INT)";

        String str2 = "DROP TABLE IF EXISTS cars";
        try {
            Connection connection = ConnectionManager.open();
            Statement statement = connection.createStatement();
            boolean temp = statement.execute(str2);
            System.out.println(temp);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}