// java.sql contains all the classes needed for manipulating/controlling a database
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;


// connecting
// using
// outputting

public class SetUp {
    // to connect to database first we need the url, username, password
    private static String DB_URL = "jdbc:mysql://localhost:3306/sql_store";
    private static String USER = "root";
    private static String PASSKEY = "";

    private static Connection con; // establish a connection with mysql
    private static Statement stmt; // to execute the query
    private static ResultSet rset; // result gets stored in ResultSet

    private static String QString = "select * from customers;";

    public static void connectToDB() throws SQLException{
        con = DriverManager.getConnection(DB_URL, USER, PASSKEY);
        stmt = con.createStatement();
    }

    public static void testConnection() throws SQLException {
        try {
            rset = stmt.executeQuery(QString);

            while(rset.next()) {
                System.out.println(rset.getString("first_name"));
            }

        } catch(SQLException e) {
            throw e;
        }
    }
}

class test {
    public static void main(String[] args) {
        try {
            SetUp.connectToDB();
            SetUp.testConnection();
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}