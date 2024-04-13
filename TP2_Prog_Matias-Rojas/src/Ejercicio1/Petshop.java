package Ejercicio1;

import java.util.ArrayList;

public class Petshop {
    private ArrayList<Animal> animals;
    public Petshop() {
        animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        this.animals.add(animal);
        System.out.println("Se ha agregado un "+animal.getAnimalType()+" a la tienda"+'\n');
    }
    public void feedAnimal(String name){
        for(Animal animal:animals){
            if(animal.getName().equals(name)){
                animal.feed();
            }
        }
    }
    public void listAnimals(){
        System.out.println("Animales de la tienda: ");
        for(Animal animal:animals){
            System.out.println(animal);
        }
        System.out.println();
    }
    public void sellAnimals(String name){
        int removeIndex = 0;
        boolean remove = false;
        for(Animal animal:animals){
            if(animal.getName().equals(name)){
                System.out.println(name+" ha sido vendido!"+'\n');
                removeIndex = animals.indexOf(animal);
                remove = true;
            }
        }
        if (remove){animals.remove(removeIndex);}
    }
}
