public class Square implements Figure, Drawable, Rotatable{
    private double side;

    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Se ha dibujado un cuadrado con lados de medida: "+this.side);
    }

    @Override
    public void area() {
        double squareArea;
        squareArea = this.side * this.side;
        System.out.println("El área del cuadrado es: "+squareArea);
    }

    @Override
    public void rotate() {
        System.out.println("El cuadrado ha sido rotado 45°");
    }
}
