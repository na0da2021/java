import java.util.ArrayList;

public class ShapeCalculatorDemo {
    public static void main(String[] args) {
        System.out.println("**** Geometric Shape Calculator Demo ****");
        Circle circle = new Circle(7);
        Rectangular rectangular = new Rectangular(5, 10);

        ArrayList <Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangular);

        for (Shape currentShape : shapes) {
            System.out.println("shape Name: " + currentShape.getName());
            System.out.println("Shape Area: " + currentShape.getArea());
            System.out.println("Shape Perimeter: " + currentShape.getPerimeter());
        }

        System.out.println("**** End of Demo ****");

    }
}
