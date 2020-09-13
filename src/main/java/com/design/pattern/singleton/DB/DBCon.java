package com.design.pattern.singleton.DB;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBCon {
    private static DBCon instance = new DBCon();

    private DBCon(){

    }

    public static DBCon getInstance(){
        if(instance == null){
            synchronized (DBCon.class){
                instance = new DBCon();
            }
        }
        return instance;
    }

    public static Connection connection;

    public static PreparedStatement pstmt;
    public static ResultSet resultSet;
    public Statement stmt;

    public Connection getConnection()
            throws IOException,
            InstantiationException,
            IllegalAccessException,
            ClassNotFoundException,
            SQLException{
        InputStream in = getClass().getClassLoader().getResourceAsStream("./sql.properties");
        String jdbcDriver = null;
        //
        String jdbcUrl = null;
        // db username
        String USERNAME = null;
        String PASSWORD = null;
        Properties properties = new Properties();
        properties.load(in);
        jdbcDriver = properties.getProperty("DRIVER");
        jdbcUrl = properties.getProperty("URL");
        USERNAME = properties.getProperty("USERNAME");
        PASSWORD = properties.getProperty("PASSWORD");

        Class.forName(jdbcDriver);
        connection = DriverManager.getConnection(jdbcUrl, USERNAME, PASSWORD);
        return connection;
    }

}
