package punto9;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.50);
        Rectangle r1 = new Rectangle(2,5.40);
        c1.calculateArea();
        c1.calculatePerimeter();
        r1.calculateArea();
        r1.calculatePerimeter();
    }
}
