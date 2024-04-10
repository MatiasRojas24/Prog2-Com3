package AsosiacionBidireccional;

import java.util.ArrayList;
public class Person {
    private String name;
    private ArrayList<Book> books = new ArrayList<>();

    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
