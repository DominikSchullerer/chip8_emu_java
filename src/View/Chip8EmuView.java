package View;

import javax.swing.*;
import java.awt.*;

public class Chip8EmuView {
    JFrame frame;

    public Chip8EmuView() {
        frame = new JFrame("Chip8 Emulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
