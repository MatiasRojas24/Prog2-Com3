package punto10;

public class Book {
    protected String title;
    protected String autor;
    protected double price;

    public Book() {
    }
    public Book(String title, String autor, double price) {
        this.title = title;
        this.autor = autor;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void printInfo(){
        System.out.println("Título: "+this.title);
        System.out.println("Autor: "+this.autor);
        System.out.println("Precio: "+this.price);
    }
}
