package practice6;

class Circle implements IGraphics {
    private String shape;
    private double radius;

    public Circle(double radius) {
        this.shape = "Circle";
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(shape + " Draw");
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return shape + " [radius=" + radius + "]";
    }
}
