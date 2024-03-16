public class Bicycle extends Vehicle{
    private String type;

    public Bicycle(String type) {
        this.type = type;
    }

    public Bicycle(String color, int wheels, String type) {
        super(color, wheels);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Color: " + this.color + " - " + "Ruedas: " + this.wheels + " - " + "Tipo: " + this.type;
    }
}
