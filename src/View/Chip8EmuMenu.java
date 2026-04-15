package View;

import javax.swing.*;
import java.awt.event.ActionListener;

class Chip8EmuMenu {
    private final JMenuBar menuBar;

    private final JMenuItem loadItem;
    private final JMenuItem exitItem;

    Chip8EmuMenu() {
        menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        loadItem = new JMenuItem("Load Rom");
        exitItem = new JMenuItem("Exit");

        fileMenu.add(loadItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
    }

    JMenuBar getMenuBar() {
        return menuBar;
    }

    void setLoadListener(ActionListener listener) {
        loadItem.addActionListener(listener);
    }

    void setExitListener(ActionListener listener) {
        exitItem.addActionListener(listener);
    }
}
