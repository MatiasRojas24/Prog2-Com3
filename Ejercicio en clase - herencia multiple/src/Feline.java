public abstract class Feline extends Animal{
    public Feline() {
    }

    public Feline(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }
    @Override
    public void roar() {
        System.out.println("El felino ruge!");
    }
}
