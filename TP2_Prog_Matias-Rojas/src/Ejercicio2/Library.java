package Ejercicio2;
import java.util.ArrayList;
public class Library{
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        this.books.add(book);
        System.out.println("Se ha agregado un libro a la biblioteca"+'\n');
    }
    public void listBooks(){
        System.out.println("Libros de la biblioteca"+'\n');
        for(Book book:books){
            System.out.println(book);
        }
    }
    public void libraryLendBook(int bookId){
        for (Book book:books){
            if (book.getId() == bookId){
                if(book.isBorrowed()){
                    System.out.println("El libro ya está prestado"+'\n');
                }else{
                    book.lendBook();
                }
            }
        }
    }
    public void libraryReturnBook(int bookId){
        for (Book book:books){
            if (book.getId() == bookId){
                if(book.isBorrowed()){
                    book.returnBook();
                }else{
                    System.out.println("El libro ya ha sido devuelto");
                }
            }
        }
    }
}
