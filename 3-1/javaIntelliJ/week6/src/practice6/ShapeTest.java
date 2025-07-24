package practice6;

public class ShapeTest {
    public static void main(String[] args) {
        IGraphics[] arrayOfIGraphics = new IGraphics[3];

        arrayOfIGraphics[0] = new Rectangle(12.3, 3.4);
        arrayOfIGraphics[1] = new Rectangle(20.3, 5.6);
        arrayOfIGraphics[2] = new Circle(12.3);

        for(IGraphics iGraphics : arrayOfIGraphics) {
            iGraphics.draw();
            System.out.println(iGraphics.toString());
            System.out.printf("둘레 : %.2f\n", iGraphics.perimeter());
            System.out.println();
        }
    }
}
