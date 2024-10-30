
import javax.swing.*;
import java.sql.*;
// import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;

// import java.sql.*;

// import javax.swing.JOptionPane;

// import com.mysql.cj.xdevapi.Statement;

public class App {

    public static void start() throws SQLException {
        JDBC.enableConnection();
    }


    public static void main(String[] args) throws Exception {
        try{
            start();
        } 
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

// javac -d ../bin -cp "../lib/ConnectorJ.jar" App.java
// java -cp "../lib/ConnectorJ.jar;../bin" App