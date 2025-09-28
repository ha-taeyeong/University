package week5.practice4;

class Triangle extends Shape {
    public Triangle(String name, double x, double y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return x*y / 2;
    }

}
