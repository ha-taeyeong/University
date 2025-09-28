package week5.practice4;

class Circle extends Shape {
    public Circle(String name, double x, double y) {
        super(name);
        this.x = x;
        this.y = 3.14;
    }
    @Override
    public double getArea() {
        return (x*x) * y;
    }
}
