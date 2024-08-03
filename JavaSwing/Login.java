package JavaSwing;

// Swing / JComponents
import javax.swing.*;

// layout a.w.t --> abstract window toolkit
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Login {
    final String name = "Nikhil";
    final char[] password = {'1', '2', '3', '4'};

    JFrame frame = new JFrame();

    public void frameInIt() {
        frame.setTitle("Login Frame");
        frame.setLayout(new GridBagLayout());
        frame.setSize(420, 420);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout();
    }

    // Focus Layout && GridLayout
    public void setLayout() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
    
        JLabel userLabel = new JLabel("Username :");
        gbc.gridx = gbc.gridx = 0;
        frame.add(userLabel, gbc);
    
        JTextField userText = new JTextField(20);
        gbc.gridy = 1;
        frame.add(userText, gbc);
    
        JLabel passLabel = new JLabel("Password :");
        gbc.gridy = 2;
        frame.add(passLabel, gbc);
    
        JPasswordField passText = new JPasswordField(20);
        gbc.gridy = 3;
        frame.add(passText, gbc);

        JButton submitBtn = new JButton();
        submitBtn.setText("Submit");

        gbc.gridy = 5;
        frame.add(submitBtn, gbc);
    
        frame.setVisible(true);

        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkCredentials(userText.getText(), passText.getPassword())) {
                    System.out.println("ACCESS PERMITTED");
                    JOptionPane.showMessageDialog(frame, "Login successful!", "Login Dialogue", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.out.println("ACCESS DENIED");
                    JOptionPane.showMessageDialog(frame, "Login unsuccessful!", "Login Diaolgue", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    private boolean checkCredentials(String username, char[] password) {
        return username.equals(this.name) && Arrays.equals(password, this.password);
    }

}