import Controller.C8EmuController;
import Model.Chip8;
import View.C8EmuView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            C8EmuView view = new C8EmuView();
            Chip8 chip8 = new Chip8();
            new C8EmuController(chip8, view);
        });
    }
}