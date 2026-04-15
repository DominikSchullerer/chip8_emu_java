package Model;

class Chip8Display {
    int width;
    int height;
    boolean[] data;

    public Chip8Display(int width, int height) {
        this.width = width;
        this.height = height;
        data = new boolean[width * height];
    }
}
