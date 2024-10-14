
import java.sql.*;

public class JDBC {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/book_store";
    private static final String USER = "root";
    private static final String PASSKEY = "oppai";

    private static Connection key = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    private static PreparedStatement pstmt = null;

    private static String test = "SELECT * FROM Customers";

    public static boolean enableConnection() {
        try {
            key = DriverManager.getConnection(DB_URL, USER, PASSKEY);
            stmt = key.createStatement();
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void closeConnection() {
        try {
            if(rs != null) {
                rs.close();
            }
            if(stmt != null) {
                stmt.close();
            }
            if(key != null) {
                key.close();
            }
        } catch(SQLException e) {
            System.out.println("Error: Closing Connection.");
        }
    }

    public static boolean testConnection() {
        try {
            rs = stmt.executeQuery(test);
            if(rs == null) return false;
            while(rs.next()) {
                System.out.println(rs.getString("first_name") + " " + rs.getString("phone"));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static boolean registerUser() {
        try {
            pstmt = key.prepareStatement(CMD.ADDUSER.getValue());
            pstmt.setString(1, "John");
            pstmt.setString(2, "Wick");
            pstmt.setString(3, "john.wick@email.com");
            pstmt.setString(4, "1234567890");
            pstmt.setString(5, "Near Nasville, USA");
            pstmt.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
