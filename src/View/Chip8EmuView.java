package View;

import javax.swing.*;
import java.awt.*;

public class Chip8EmuView {
    JFrame frame;
    DisplayPanel displayPanel;

    public Chip8EmuView() {
        frame = new JFrame("Chip8 Emulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        displayPanel = new DisplayPanel();
        frame.getContentPane().add(displayPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
