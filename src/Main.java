import Controller.Chip8EmuController;
import Model.Chip8;
import View.Chip8EmuView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Chip8EmuView view = new Chip8EmuView();
            Chip8 chip8 = new Chip8();
            Chip8EmuController controller = new Chip8EmuController(chip8, view);
        });
    }
}