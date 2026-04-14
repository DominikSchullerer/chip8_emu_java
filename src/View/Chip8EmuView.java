package View;

import javax.swing.*;
import java.awt.*;

public class Chip8EmuView {
    JFrame frame;

    public Chip8EmuView() {
        frame = new JFrame("Chip8 Emulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World", JLabel.CENTER);
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
    }

    public void show() {
        frame.setVisible(true);
    }
}
