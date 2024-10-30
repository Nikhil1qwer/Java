package Java_Swing.Introduction.LABELS;

/**
 * JLabel
 */

import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.*;
import javax.swing.*;

public class JLABEL {

    public static void main(String[] args) {

        ImageIcon img = new ImageIcon("Java_Swing\\Introduction\\resources\\java.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

        // JLabel --> to add text or image to the frame or both
        // Jlabel takes up the entire frame by default
        JLabel label = new JLabel();
        label.setText("This is a JLabel");
        label.setIcon(img);
        
        /*Positioning the label x, y horizontal, vertical respectively
         *      Horizontal = JLabel.(CENTER, LEFT, RIGHT, LEADING, TRAILING)
         *      Vertical = JLabel.(CENTER, TOP, BOTTOM, LEADING, TRAILING)
         */
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        /**
         * Set the text color
         *     Color.(BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW)
         * Set the text font
         *      Font.(String name, int style, int size)
         */
        label.setForeground(Color.GREEN);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(0); // pixels between the text and the image
        label.setBackground(Color.BLACK);
        label.setOpaque(true); // set the background color to be visible

        // Set the border
        label.setBorder(border);

        // Alignment of the label
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(0, 0, 400, 400); // sets x, y of the label aswell as dimensions(width, height)



        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setResizable(false);
        // frame.setLayout(null);
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // packs all the components in the frame

    }
}