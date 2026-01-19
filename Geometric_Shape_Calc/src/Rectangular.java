public class Rectangular extends Shape{

    private double length;
    private double width;
    public Rectangular(double length, double width) {
        super("Rectangular");
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return ((length+width)*2);
    }
}
