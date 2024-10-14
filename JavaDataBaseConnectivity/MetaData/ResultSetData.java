package JavaDataBaseConnectivity.MetaData;

import java.sql.*;
import JavaDataBaseConnectivity.JDB; // JDBC DriverClass

public class ResultSetData {
    public static void main(String[] args) {
        try {
            start();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static void start() throws SQLException {
        JDB.connect();
        Connection key = JDB.getConnection();
        Statement stmt = key.createStatement();

        ResultSet res = stmt.executeQuery("SELECT * FROM customers;");
        ResultSetMetaData resd = res.getMetaData();
        
        System.out.println("Coloumn Count in CUSTOMERS TABLE: " + resd.getColumnCount());
        int coloumns = resd.getColumnCount();

        for(int i = 1; i < coloumns; i++) {
            System.out.println("Coloumn Name: " + resd.getColumnName(i));
        }

    }
}
