package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Petshop petShop = new Petshop();
        Dog d1 = new Dog("Bruno",4,4500,"Caniche",false);
        Dog d2 = new Dog("Zack",6,6000,"Pastor alemán",true);
        Cat c1 = new Cat("Nala",2,5000,"Persa",true);
        Bird b1 = new Bird("Blue",1,9000,"Guamacayo azul",true);
        Fish f1 = new Fish("Nemo",2,2800,"Payaso");

        petShop.addAnimal(d1);
        petShop.addAnimal(d2);
        petShop.addAnimal(c1);
        petShop.addAnimal(b1);
        petShop.addAnimal(f1);

        petShop.listAnimals();

        petShop.feedAnimal("Bruno");
        petShop.feedAnimal("Blue");

        petShop.sellAnimals("Zack");

        petShop.listAnimals();
    }
}
