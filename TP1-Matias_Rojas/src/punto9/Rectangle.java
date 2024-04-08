package punto9;

public class Rectangle implements GeometricFigure{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("El área de un rectángulo es: "+(this.length*this.width));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("El perímetro del rectángulo es: "+(2*this.length+2*this.width));
    }
}
