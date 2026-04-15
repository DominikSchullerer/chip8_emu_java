package Controller;

import Model.Chip8;
import View.Chip8EmuView;

public class Chip8EmuController {
    Chip8 chip8;
    Chip8EmuView view;

    public Chip8EmuController(Chip8 chip8, Chip8EmuView view) {
        this.chip8 = chip8;
        this.view = view;
    }
}
