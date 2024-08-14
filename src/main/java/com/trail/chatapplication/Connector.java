/*
package com.trail.chatapplication;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Connector {
    String url = "jdbc:mysql://localhost://3660";
    String userName = "root";
    String password = "0000";
    
  try{  Connection conn = DriverManager.getConnection(url, userName, password);
    Statement statement = conn.createStatement();
    ResultSet read = statement.executeQuery("Select * from database");
    
}
 catch(Exception e){
        System.out.println(e);
}
    
}
*/