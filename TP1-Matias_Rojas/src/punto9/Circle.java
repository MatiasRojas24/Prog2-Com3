package punto9;

public class Circle implements GeometricFigure{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("El área del círculo es: "+(Math.PI*Math.pow(this.radius,2)));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("El perímetro del círculo es: "+(2*Math.PI*this.radius));
    }
}
