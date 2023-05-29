import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";

        // SQL query to create the table
        String createTableQuery = "CREATE TABLE employees (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(50) NOT NULL," +
                "age INT NOT NULL," +
                "salary DOUBLE NOT NULL" +
                ")";

        // JDBC objects
        Connection connection = null;
        Statement statement = null;

        try {
            // Load and register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a database connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a Statement object
            statement = connection.createStatement();

            // Execute the SQL query to create the table
            int rowsAffected = statement.executeUpdate(createTableQuery);

            // Check if the table was created successfully
            if (rowsAffected > 0) {
                System.out.println("Table created successfully.");
            } else {
                System.out.println("Table creation failed.");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the database resources
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
