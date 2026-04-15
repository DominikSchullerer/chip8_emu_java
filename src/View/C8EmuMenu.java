package View;

import Commons.C8MenuAction;
import Commons.C8MenuListener;

import javax.swing.*;

class C8EmuMenu {
    private final JMenuBar menuBar;

    private C8MenuListener menuListener;

    C8EmuMenu() {
        menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem loadItem = new JMenuItem("Load Rom");
        loadItem.addActionListener(e-> {
            if (menuListener != null) {
                menuListener.onMenuAction(C8MenuAction.LOAD);
            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e-> {
            if (menuListener != null) {
                menuListener.onMenuAction(C8MenuAction.EXIT);
            }
        });

        fileMenu.add(loadItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
    }



    void bindMenuListener(C8MenuListener menuListener) {
        this.menuListener = menuListener;
    }

    JMenuBar getMenuBar() {
        return menuBar;
    }
}
