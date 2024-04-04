
public class Circle implements Figure, Drawable{
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
    public void draw() {
        System.out.println("Se ha dibujado un círculo de radio: "+this.radius);
    }
    @Override
    public void area() {
        double circleArea;
        circleArea = Math.PI * Math.pow(radius,2);
        System.out.printf("El area del círculo es: "+"%.2f", circleArea);
        System.out.println();
    }
}
