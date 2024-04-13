package Ejercicio1;

public class Dog extends Animal{
    private String breed;
    private boolean vaccinated;

    public Dog(String breed, boolean vaccinated) {
        this.breed = breed;
        this.vaccinated = vaccinated;
    }

    public Dog(String name, int age, double price, String breed, boolean vaccinated) {
        super(name, age, "Perro", price);
        this.breed = breed;
        this.vaccinated = vaccinated;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        if (vaccinated) {
            return super.toString() + "Raza: " + this.breed + '\n'
                    +"Vacunado"+'\n';
        }else{
            return super.toString() + "Raza: " + this.breed + '\n'
                    +"Sin vacunar"+'\n';
        }
    }
}
