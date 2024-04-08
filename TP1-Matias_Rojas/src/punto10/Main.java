package punto10;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Martín Fierro","José Hernández",4000);
        Textbook t1 = new Textbook("Matemáticas básicas","autorEj",8000,"3C");
        TextbookUNC tu1 = new TextbookUNC("Programación","autorEj",11200,"B","UTN");
        Novel n1 = new Novel("El señor de los anillos - La comunidad del anillo","J. R. R. Tolkien",7800,"Fantasía");
        b1.printInfo();
        System.out.println();
        t1.printInfo();
        System.out.println();
        tu1.printInfo();
        System.out.println();
        n1.printInfo();
    }
}
