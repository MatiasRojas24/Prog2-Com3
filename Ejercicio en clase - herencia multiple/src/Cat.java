public class Cat extends Feline{
    public Cat() {
    }

    public Cat(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    public void makeNoise() {
        System.out.println("El gato hace ruido!");
    }

    @Override
    public void eat() {
        System.out.println("El gato come "+this.food);
    }

    public void vaccinate(){
        System.out.println("El gato ha sido vacunado");
    }
}
