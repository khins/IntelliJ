package com.github.khins.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
// https://www.lynda.com/Java-tutorials/Data-Access-Object-DAO-pattern/779748/5033995-4.html?autoplay=true
// from Learning JDBC
public class DatabaseConnectionManager {
    private final String url;
//    private final Properties properties;

    public DatabaseConnectionManager(String host, String databaseName, String userName, String password) {
        this.url = "jdbc:sqlite:C:\\Users\\kevin\\Documents\\Learning Library\\Java\\testDb_C.db";
//        this.properties = new Properties();
//        this.properties.setProperty("user", userName);
//        this.properties.setProperty("password", password);

    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url);
    }
}
