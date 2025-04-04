package week5.practice4;

public class Test {
    public static void main(String args[]) {
        Shape[ ] objs = new Shape[2];
        objs[0] = new Circle("Circle",1, 3.14);
        objs[1] = new Triangle("Rectangle",1, 2);
        for( Shape obj : objs )
            System.out.println(obj.getName() + " area = " + obj.getArea());
    }
}
