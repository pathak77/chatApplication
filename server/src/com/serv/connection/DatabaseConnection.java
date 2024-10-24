package com.serv.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;

   
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private DatabaseConnection() {
       
    }

    public void connectToDatabase() throws SQLException {
       String userName ="root";
       String password ="0000";
     try{  
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatapp",userName, password);
     }
     catch(Exception e){
         System.out.println(e);
     }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle exception appropriately
            }
        }
    }

    public boolean isAutoCommit() throws SQLException {
        return connection != null && connection.getAutoCommit();
    }

    public void setAutoCommit(boolean autoCommit) throws SQLException {
        if (connection != null) {
            connection.setAutoCommit(autoCommit);
        }
    }
}
