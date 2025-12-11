package backend;

import java.sql.*;

public class DBHelper {
    private static final String URL = "jdbc:mysql://localhost:3306/pharmacy";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Database connection error: " + e.getMessage());
            return null;
        }
    }

    public static Connection getConnection() {
        return connect();
    }
}
