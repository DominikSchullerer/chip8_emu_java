package Model;

class C8Display {
    private final int width;
    private final int height;
    private final boolean[] data;

    C8Display(int width, int height) {
        this.width = width;
        this.height = height;
        data = new boolean[width * height];
    }
}
