package JavaDataBaseConnectivity.MetaData;

import JavaDataBaseConnectivity.Introduction.JDBC;
import java.sql.*;

/**
 * MetaData provides the DataBase Details
 */

public class Demo {
    public static void main(String[] args) {
        try {
            start();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void start() throws SQLException {
        Connection key = JDBC.getConnection();
        DatabaseMetaData data = key.getMetaData();
        ResultSet res = data.getTables(null, null, "customers", new String[] {"TABLE"});
        while(res.next()) {
            System.out.println(res.getString(1));
        }
    }
}
