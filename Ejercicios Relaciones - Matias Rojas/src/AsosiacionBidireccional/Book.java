package AsosiacionBidireccional;

import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Person> owners = new ArrayList<>();
    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Person> getOwners() {
        return owners;
    }

    public void setOwners(ArrayList<Person> owners) {
        this.owners = owners;
    }
}
