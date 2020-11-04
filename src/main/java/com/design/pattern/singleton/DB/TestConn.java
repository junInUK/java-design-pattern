package com.design.pattern.singleton.DB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConn {
    public static void main(String[] args){
        DBCon dbInstance = DBCon.getInstance();
        try{
            Connection conn = dbInstance.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "SELECT id, name, description from todos";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String desc = rs.getString("description");
                System.out.println("id:"+id+ " name:"+name + " description:"+desc);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException e){
            System.out.println("SQLException:" + e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("ClassNotFoundException:" + e.getMessage());
        }

    }
}
