package Ejercicio1;

public class Bird extends Animal{
    private String species;
    private boolean talk;

    public Bird(String species, boolean talk) {
        this.species = species;
        this.talk = talk;
    }

    public Bird(String name, int age, double price, String species, boolean talk) {
        super(name, age, "Pájaro", price);
        this.species = species;
        this.talk = talk;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isTalk() {
        return talk;
    }

    public void setTalk(boolean talk) {
        this.talk = talk;
    }

    @Override
    public String toString() {
        if (talk) {
            return super.toString()+"Especie: "+this.species+'\n'
                    +"Habla"+'\n';
        }else{
            return super.toString()+"Especie: "+this.species+'\n'
                    +"No habla"+'\n';
        }
    }
}
