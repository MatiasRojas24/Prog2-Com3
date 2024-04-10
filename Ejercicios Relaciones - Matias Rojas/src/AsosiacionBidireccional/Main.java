package AsosiacionBidireccional;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> bookOwners1 = new ArrayList<>();
        ArrayList<Person> bookOwners2 = new ArrayList<>();
        ArrayList<Book> booksOwned1 = new ArrayList<>();
        ArrayList<Book> booksOwned2 = new ArrayList<>();

        Person p1 = new Person("Marcos");
        Person p2 = new Person("Pedro");


        Book b1 = new Book("Libro1");
        Book b2 = new Book("Libro2");

        bookOwners1.add(p1);
        bookOwners1.add(p2);
        b1.setOwners(bookOwners1);

        bookOwners2.add(p1);
        b2.setOwners(bookOwners2);

        booksOwned1.add(b1);
        booksOwned1.add(b2);
        p1.setBooks(booksOwned1);

        booksOwned2.add(b1);
        p2.setBooks(booksOwned2);


        System.out.println("Dueño: "+p1.getName());
        System.out.println("Libros: "+p1.getBooks().get(0).getTitle()+", "+p1.getBooks().get(1).getTitle());
        System.out.println();

        System.out.println("Dueño: "+p2.getName());
        System.out.println("Libros: "+p2.getBooks().get(0).getTitle());
        System.out.println();


        System.out.println("Libro: "+b1.getTitle());
        System.out.println("Dueños: "+b1.getOwners().get(0).getName()+", "+b1.getOwners().get(1).getName());
        System.out.println();

        System.out.println("Libro: "+b2.getTitle());
        System.out.println("Dueños: "+b2.getOwners().get(0).getName());
        System.out.println();
    }
}
