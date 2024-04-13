package Ejercicio1;

import org.w3c.dom.ls.LSOutput;

public class Cat extends Animal{
    private String breed;
    private boolean sterilized;

    public Cat(String breed, boolean sterilized) {
        this.breed = breed;
        this.sterilized = sterilized;
    }

    public Cat(String name, int age, double price, String breed, boolean sterilized) {
        super(name, age, "Gato", price);
        this.breed = breed;
        this.sterilized = sterilized;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    @Override
    public String toString() {
        if (sterilized) {
            return super.toString() + "Raza: " + this.breed + '\n'
                    +"Esterilizado"+'\n';
        }else{
            return super.toString() + "Raza: " + this.breed + '\n'
                    +"Sin esterilizar"+'\n';
        }
    }
}
