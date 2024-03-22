public class Lion extends Feline{
    public Lion(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    public void makeNoise() {
        System.out.println("El león hace ruido!");
    }

    @Override
    public void eat() {
        System.out.println("El león come "+this.food);
    }


}
