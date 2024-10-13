package OOPS.ExeptionHandling__try_catch;

import java.util.*;
import javax.swing.*;

/*
 * CustomExceptions:
 *      If you find that no Existing Exception adequately describes the Exception
 *      we can create our own
 *      And are created by extending the Exception class are super class or one of its sub-classes
 */

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}


public class CustomExceptions {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner sc = new Scanner(System.in);
        try {
            exception();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
        sc.close();
    }

    private static void exception() throws CustomException {
        try {

        } catch(Exception e) {
            throw new CustomException("An unhandled error");
        }
    }
}
