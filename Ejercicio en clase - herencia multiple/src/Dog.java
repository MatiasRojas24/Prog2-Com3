public class Dog extends Canine{
    public Dog() {
    }

    public Dog(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    public void makeNoise() {
        System.out.println("El perro hace ruido!");
    }

    @Override
    public void eat() {
        System.out.println("El perro come "+this.food);
    }

    public void takeOnAWalk(){
        System.out.println("El perro ha salido a pasear!");
    }
}
