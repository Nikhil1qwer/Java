package Java_Swing.Introduction.FRAMES;

import javax.swing.*;
import java.awt.*;

public class MYFRAME extends JFrame {
    public MYFRAME() {
        this.setTitle("JFrame Title");
        ImageIcon img = new ImageIcon("Java_Swing\\Introduction\\resources\\image.png");
        this.setIconImage(img.getImage());
        this.setSize(420, 420); // width, height
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setResizable(false); // prevent resizing
        Color color = Color.WHITE; // new Color(r, g, b); 0 - 255
        this.getContentPane().setBackground(color);
        this.setVisible(true);
    }
}

class Test {
    public static void main(String[] args) {
        // MYFRAME frame = new MYFRAME(); instace to make changes
        // new MYFRAME(); jst a frame instance
    }
}