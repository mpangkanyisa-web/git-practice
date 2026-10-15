import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    // Example JDBC URL for a local MySQL database
    private static final String URL = "jdbc:mysql://localhost:3306/my_database";
    private static final String USER = "root";
    private static final String PASSWORD = "password123";

    public static Connection getConnection() throws SQLException {
        // Obtains and returns a live database connection session
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
