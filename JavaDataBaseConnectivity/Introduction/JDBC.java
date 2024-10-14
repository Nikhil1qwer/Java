package JavaDataBaseConnectivity.Introduction;

import java.sql.*;

public class JDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/sql_store";
    private static final String USER = "root";
    private static final String PASSKEY = "oppai";

    private static Connection key;
    private static Statement stmt;

    private static boolean isConnected;

    public static void connect() {
        try {
            key = DriverManager.getConnection(URL, USER, PASSKEY);
            stmt = key.createStatement();
            isConnected = true;
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if(!isConnected) connect();
        return key;
    }

    public static Statement getStatement() {
        if(!isConnected) connect();
        return stmt;
    }


}