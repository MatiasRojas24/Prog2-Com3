package Ejercicio2;

public abstract class Book implements Loanable{
    private int id;
    private String title;
    private String autor;
    private boolean borrowed;
    private int yearOfPublication;

    public Book() {
    }

    public Book(int id, String title, String autor, int yearOfPublication) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.borrowed = false;
        this.yearOfPublication = yearOfPublication;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public void lendBook() {
        System.out.println("Se ha prestado el libro de id "+this.id+'\n');
        this.borrowed = true;
    }

    @Override
    public void returnBook() {
        System.out.println("Se ha devuelto el libro de id "+this.id+'\n');
        this.borrowed = false;
    }
    @Override
    public String toString() {
        if (borrowed) {
            return "Id: " + this.id +'\n'+
                    "Título: " + this.title +'\n'+
                    "Autor: " + this.autor +'\n'+
                    "Prestado"+'\n'+
                    "Año de publicación: " + this.yearOfPublication +'\n';
        }else{
            return "Id: " + this.id +'\n'+
                    "Título: " + this.title +'\n'+
                    "Autor: " + this.autor +'\n'+
                    "Disponible"+'\n'+
                    "Año de publicación: " + this.yearOfPublication +'\n';
        }
    }
}
