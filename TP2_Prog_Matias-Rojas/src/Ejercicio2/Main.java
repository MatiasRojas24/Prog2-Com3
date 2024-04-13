package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Novel n1 = new Novel(1,"El señor de los anillos: La comunidad del anillo","J. R. R. Tolkien",1954,"Fantasía");
        Academic a1 = new Academic(2,"Programación básica","pepito",2023,"Universidad Tecnológica Nacional");
        Childish d1 = new Childish(3,"El monstruo de colores","Ana Llenas",2012,7);

        library.addBook(n1);
        library.addBook(a1);
        library.addBook(d1);

        library.listBooks();

        library.libraryReturnBook(1);
        library.libraryLendBook(2);
        library.libraryLendBook(2);
        library.libraryLendBook(3);
        library.libraryReturnBook(3);

        library.listBooks();

    }
}
