package javatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertData {
	
	
	 private static final String URL = "jdbc:mysql://localhost:3306/your_database_name";
	    private static final String USER = "root";
	    private static final String PASSWORD = "your_password";

	    public static void main(String[] args) {
	        Connection connection = null;

	        try {
	            // Load MySQL JDBC Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Connect to the database
	            connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println("✅ Database connected successfully!");

	        } catch (ClassNotFoundException e) {
	            System.out.println("❌ MySQL JDBC Driver not found!");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("❌ Database connection failed!");
	            e.printStackTrace();
	        } finally {
	            // Close connection
	            try {
	                if (connection != null && !connection.isClosed()) {
	                    connection.close();
	                    System.out.println("🔒 Connection closed.");
	                }
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }


}
