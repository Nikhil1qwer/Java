package JavaDataBaseConnectivity;

import java.sql.*;

public class JDB {
    private static final String URL = "jdbc:mysql://localhost:3306/sql_store";
    private static final String USER = "root";
    private static final String PASSKEY = "oppai";

    private static Connection key;
    private static Statement stmt;

    private static boolean isConnected;

    public static void connect() throws SQLException {
        key = DriverManager.getConnection(URL, USER, PASSKEY);
        stmt = key.createStatement();
        isConnected = true;
    }

    public static Connection getConnection() throws SQLException {
        if(!isConnected) connect();
        return key;
    }

    public static Statement getStatement() throws SQLException {
        if(!isConnected) connect();
        return stmt;
    }
}
