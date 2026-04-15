package Controller;

import Commons.C8MenuListener;
import Model.Chip8;
import View.C8EmuView;

public class C8EmuController {
    private final Chip8 chip8;
    private final C8EmuView view;
    private final C8MenuListener menuListener;


    public C8EmuController(Chip8 chip8, C8EmuView view) {
        this.chip8 = chip8;
        this.view = view;

        this.menuListener = new C8EmuMenuListener();

        view.bindMenuListener(this.menuListener);
    }
}
