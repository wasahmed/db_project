package com.example.demo;

import org.springframework.stereotype.Service;
import java.sql.*;
import java.util.Properties;

@Service
public class DBConnect {

    Connection conn = null;
    private void query(Connection connection, String query){

        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection excuteQuery(String sql){
        System.out.println("HERE");
        try
        {
            Properties info = new Properties();
            String url;
            url = "jdbc:mysql://localhost:3306/voting";
            info.put("user", "root");
            info.put("password", "root");
            conn = DriverManager.getConnection(url, info);
            query(conn, sql);
            return conn;

        } catch(Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
