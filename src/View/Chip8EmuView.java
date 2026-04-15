package View;

import javax.swing.*;
import java.awt.*;

public class Chip8EmuView {
    JFrame frame;
    DisplayPanel displayPanel;
    Chip8EmuMenu menu;

    public Chip8EmuView() {
        frame = new JFrame("Chip8 Emulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayPanel = new DisplayPanel();
        frame.getContentPane().add(displayPanel, BorderLayout.CENTER);

        menu = new Chip8EmuMenu();
        frame.setJMenuBar(menu.getMenuBar());

        frame.pack();
        frame.setVisible(true);
    }
}
