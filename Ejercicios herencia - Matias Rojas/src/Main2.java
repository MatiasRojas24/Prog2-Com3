public class Main2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Chucho",5,"Macho","Pástor Alemán");
        Cat c1 = new Cat("Nala",3,"Hembra","Persa");
        Bird b1 = new Bird("Ricky",1,"Macho","Ruiseñor");

        d1.info();
        c1.info();
        b1.info();

        d1.make_sound();
        c1.make_sound();
        b1.make_sound();

    }
}
