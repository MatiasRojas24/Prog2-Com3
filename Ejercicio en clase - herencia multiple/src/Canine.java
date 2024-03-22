public abstract class Canine extends Animal{
    public Canine() {
    }

    public Canine(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    public void roar() {
        System.out.println("El canino ruge!");
    }
}
