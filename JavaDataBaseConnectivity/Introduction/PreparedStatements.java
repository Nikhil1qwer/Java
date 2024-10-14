package JavaDataBaseConnectivity.Introduction;

import java.sql.*;
/**
 *  PreparedStatements set values as either VARCHAR or INT
 */

public class PreparedStatements {
    public static void main(String[] args) {
        try {
            start();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static void start() throws SQLException {
        Connection key = JDBC.getConnection();
        PreparedStatement pstmt = key.prepareStatement("SELECT * FROM customers WHERE customer_id = ?;");
        pstmt.setInt(1, 1);
        ResultSet res = pstmt.executeQuery();
        while(res.next()) {
            System.out.println(res.getString("first_name"));
        }
    }
}
