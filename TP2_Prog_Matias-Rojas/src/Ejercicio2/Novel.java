package Ejercicio2;

public class Novel extends Book{
    private String genre;

    public Novel(String genre) {
        this.genre = genre;
    }

    public Novel(int id, String title, String autor, int yearOfPublication, String genre) {
        super(id, title, autor, yearOfPublication);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString()+"Tipo: Novela"+'\n'+
                "Género: "+this.genre+'\n';
    }
}
