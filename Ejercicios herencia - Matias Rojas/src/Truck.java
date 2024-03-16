public class Truck extends Vehicle{
    private double load;

    public Truck(double load) {
        this.load = load;
    }

    public Truck(String color, int wheels, double load) {
        super(color, wheels);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Color: " + this.color + " - " + "Ruedas: " + this.wheels + " - " + "Carga: " + this.load + "kg";
    }
}
