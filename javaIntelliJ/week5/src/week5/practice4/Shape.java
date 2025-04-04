package week5.practice4;

abstract class Shape {
    protected  String name;
    protected  double x,y;
    public abstract double getArea();

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
