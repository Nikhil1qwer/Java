package Java_Swing.Introduction.FRAMES;

import javax.swing.*;
import java.awt.Color;

/**
 * GUI --> Graphical User Interface
 */

public class JFRAME {
    public static void main(String[] args) {

        // JFrame --> a GUI window to add components to
        JFrame frame = new JFrame();
        frame.setTitle("JFrame Title");

        // ImageIcon --> to add an icon to the JFrame
        ImageIcon img = new ImageIcon("Java_Swing\\Introduction\\resources\\image.png");
        frame.setIconImage(img.getImage());

        frame.setSize(420, 420); // width, height

        // JFrame.EXIT_ON_CLOSE --> close the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); // prevent resizing

        Color color = Color.BLACK; // new Color(r, g, b); 0 - 255
        frame.getContentPane().setBackground(color);



        frame.setVisible(true);
    }
}