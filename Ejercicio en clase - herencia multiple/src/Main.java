public class Main {
    public static void main(String[] args) {
        Lion l1 = new Lion("'fotoLeon'","carne","Africa","Grande");
        Tiger t1 = new Tiger("'fotoTigre'","carne","India","Grande");
        Cat c1 = new Cat("'fotoGato'","whiskas","Argentina","Pequeño");
        Dog d1 = new Dog("'fotoPerro'","dogchow","Perú","Pequeño");
        Wolf w1 = new Wolf("'fotoLobo'","carne","Kazajistán","Mediano");

        // Los métodos se definen en la clase más baja en la que figure el método en el UMl.
        // La clase más baja en la que se encuentra dormir es animal, por lo que se define en animal
        // La clase más baja en la que se encuentra roar es en canino y felino por lo que se define en dichas clases
        // El resto de los métodos tienen su clase más baja en las clases concretas (leon, tigre, gato, perro, lobo)
        // por lo que se define en esas clases
        l1.eat();
        l1.roar();
        l1.makeNoise();
        l1.sleep();
        System.out.println();

        t1.eat();
        t1.roar();
        t1.makeNoise();
        t1.sleep();
        System.out.println();

        c1.eat();
        c1.roar();
        c1.makeNoise();
        c1.sleep();
        c1.vaccinate();
        System.out.println();

        d1.eat();
        d1.roar();
        d1.makeNoise();
        d1.sleep();
        d1.takeOnAWalk();
        System.out.println();

        w1.eat();
        w1.roar();
        w1.makeNoise();
        w1.sleep();
    }
}
