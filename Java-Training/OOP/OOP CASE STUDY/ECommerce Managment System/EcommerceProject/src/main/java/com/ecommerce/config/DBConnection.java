package com.ecommerce.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/ecommerce_db";
    private static final String USER= "root";
    private  static final String  PASSWORD = "Bhanu@123";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
    public static void main(String args[])
    {
        try(Connection connection=getConnection())
        {
            System.out.println("MYSQL Connection Successfull");
            System.out.println("Database : " + connection.getCatalog());
        }
        catch (SQLException e)
        {
            System.out.println("Datbase Connection Failed");
            System.out.println(e.getMessage());
        }
    }

}
