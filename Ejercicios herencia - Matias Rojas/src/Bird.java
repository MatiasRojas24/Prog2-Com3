public class Bird extends Animal{
    private String species;

    public Bird(String species) {
        this.species = species;
    }

    public Bird(String name, int age, String gender, String species) {
        super(name, age, gender);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public void info(){
        System.out.println("Pájaro: ");
        System.out.println("Nombre: "+this.name);
        System.out.println("Edad: "+this.age);
        System.out.println("Género: "+this.gender);
        System.out.println("Especie: "+this.species);
        System.out.println();
    }
    @Override
    public void make_sound() {
        System.out.println("El pájaro canta");
        System.out.println();
    }
}
