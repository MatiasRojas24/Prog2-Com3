public class Dog extends Animal{
    private String race;

    public Dog(String race) {
        this.race = race;
    }

    public Dog(String name, int age, String gender, String race) {
        super(name, age, gender);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    public void info(){
        System.out.println("Perro: ");
        System.out.println("Nombre: "+this.name);
        System.out.println("Edad: "+this.age);
        System.out.println("Género: "+this.gender);
        System.out.println("Raza: "+this.race);
        System.out.println();
    }
    @Override
    public void make_sound() {
        System.out.println("El perro ladra");
        System.out.println();
    }
}
