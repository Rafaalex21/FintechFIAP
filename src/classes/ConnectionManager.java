package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/finance_db";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
}
