package com.revature.Utils;

import java.sql.*;

public class ConnectionUtil {
    public static Connection connectToDB() throws SQLException {
        try {
            Class.forName(("org.postgresql.Driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://javafs220103mjl.cmzfaa2clgvb.us-east-1.rds.amazonaws.com:5432/postgres";
        String sqlUsername = "postgres";
        String sqlPassword = "password"; //System.getenv("var-name");

        return DriverManager.getConnection(url, sqlUsername, sqlPassword);
    }

//    public static void main(String[] args){
//        try{
//            connectToDB();
//            System.out.println("Connection successful");
//        }catch (SQLException e){
//            System.out.println("Connection failed");
//            e.printStackTrace();
//        }
//    }
}
