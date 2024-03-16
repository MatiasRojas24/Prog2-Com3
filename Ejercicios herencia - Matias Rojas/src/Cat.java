public class Cat extends Animal{
    private String race;

    public Cat(String race) {
        this.race = race;
    }

    public Cat(String name, int age, String gender, String race) {
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
        System.out.println("Gato: ");
        System.out.println("Nombre: "+this.name);
        System.out.println("Edad: "+this.age);
        System.out.println("Género: "+this.gender);
        System.out.println("Raza: "+this.race);
        System.out.println();
    }
    @Override
    public void make_sound() {
        System.out.println("El gato maulla");
        System.out.println();
    }
}
