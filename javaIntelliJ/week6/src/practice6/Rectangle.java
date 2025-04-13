package practice6;

class Rectangle implements IGraphics {
    private String shape;
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.shape = "Rectangle";
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println(shape + " Draw");
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return shape + " [length=" + length + ", width=" + width + "]";
    }
}
