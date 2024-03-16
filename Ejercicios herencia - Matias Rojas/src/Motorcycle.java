public class Motorcycle extends Vehicle{
    private double velocity;
    private int cubicCapacity;

    public Motorcycle(double velocity, int cubicCapacity) {
        this.velocity = velocity;
        this.cubicCapacity = cubicCapacity;
    }

    public Motorcycle(String color, int wheels, double velocity, int cubicCapacity) {
        super(color, wheels);
        this.velocity = velocity;
        this.cubicCapacity = cubicCapacity;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    @Override
    public String toString() {
        return "Color: " + this.color + " - " + "Ruedas: " + this.wheels + " - " + "Velocidad: " + this.velocity + "km/h" + " - " + "Capacidad Cúbica: " + this.cubicCapacity + "cc";
    }
}
