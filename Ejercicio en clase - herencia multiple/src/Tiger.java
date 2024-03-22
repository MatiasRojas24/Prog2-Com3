public class Tiger extends Feline{
    public Tiger() {
    }

    public Tiger(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    public void makeNoise() {
        System.out.println("El tigre hace ruido!");
    }

    @Override
    public void eat() {
        System.out.println("El tigre come "+this.food);
    }


}
