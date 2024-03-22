public class Wolf extends Canine{
    public Wolf() {
    }

    public Wolf(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    public void makeNoise() {
        System.out.println("El lobo hace ruido!");
    }

    @Override
    public void eat() {
        System.out.println("El lobo come "+this.food);
    }
}
