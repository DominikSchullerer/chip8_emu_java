package View;

import Commons.C8MenuListener;

import javax.swing.*;
import java.awt.*;

public class C8EmuView {
    private final JFrame frame;
    private final C8DisplayPanel displayPanel;
    private final C8EmuMenu menu;

    public C8EmuView() {
        frame = new JFrame("Chip8 Emulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayPanel = new C8DisplayPanel();
        frame.getContentPane().add(displayPanel, BorderLayout.CENTER);

        menu = new C8EmuMenu();
        frame.setJMenuBar(menu.getMenuBar());

        frame.pack();
        frame.setVisible(true);
    }

    public void bindMenuListener(C8MenuListener menuListener) {
        menu.bindMenuListener(menuListener);
    }
}
