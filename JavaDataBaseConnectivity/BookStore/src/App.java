

// import Java_Swing.Main;

public class App {
    public static void main(String[] args) throws Exception {
        if(JDBC.enableConnection()) {
            // System.out.println("Connection established."); --pass
            // Main.main(args); --pass
            JDBC.testConnection();  //-- pass
            // JDBC.registerUser(); --pass
        } else {
            System.out.println("Connection failed.");
        }
    }
}

// javac -d ../bin -cp "../lib/ConnectorJ.jar" App.java
// java -cp "../lib/ConnectorJ.jar;../bin" App