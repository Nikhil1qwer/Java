package Java_Swing;

import javax.swing.JOptionPane;

public class SignUp {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Your name is: " + name);


        String[] gender = {"M", "F"};
        String userGender = (String) JOptionPane.showInputDialog(null,
                                "Select your gender: ",
                                "User Query",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                gender,
                                gender[0]);

        JOptionPane.showMessageDialog(null, userGender);

    }
}