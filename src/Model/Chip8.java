package Model;

public class Chip8 {
    private final C8Display display;

    public Chip8() {
        display = new C8Display(64, 32);
    }
}
