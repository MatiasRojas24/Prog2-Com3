package Ejercicio1;

public class Fish extends Animal{
    private String species;

    public Fish(String species) {
        this.species = species;
    }

    public Fish(String name, int age, double price, String species) {
        super(name, age, "Pez", price);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return super.toString()+"Especie: "+this.species+'\n';
    }
}
