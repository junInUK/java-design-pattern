package com.design.pattern.singleton.DB;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBCon {

    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String DB_URL = "jdbc:mysql://localhost:3306/todos_app?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "123456uk";

    //"jdbc:mysql://localhost:3306/test_demo?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","password"

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

    public Connection getConnection() throws SQLException,ClassNotFoundException {

        Class.forName(JDBC_DRIVER);
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
        if(connection!=null){
            System.out.println("Database connected!");
        }else{
            System.out.println("Database connection failed!");
        }
        return connection;
    }

}
