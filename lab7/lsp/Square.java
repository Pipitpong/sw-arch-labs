package lsp;

public class Square implements Shape {
    private int width;
    private int height;

    Square(int side) {
        this.setSide(side);
    }

    @Override
    public void setWidth(int width) {
        this.setSide(width);
    }

    @Override
    public void setHeight(int height) {
        this.setSide(height);
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    public void setSide(int side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public int getArea() {
        return this.width * this.height;
    }
}
