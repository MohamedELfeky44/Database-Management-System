/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author M.El-fiqy
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;

public class DatabaseConnectionManager {

    private static final DatabaseConnectionManager instance = new DatabaseConnectionManager();

    private Connection connection=null;

    private DatabaseConnectionManager() {
        try {
            DriverManager.registerDriver(new OracleDriver());
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception or throw a custom exception
        }
    }

    public static DatabaseConnectionManager getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
