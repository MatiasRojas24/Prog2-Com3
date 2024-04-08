package punto10;

public class Novel extends Book{
    private String genre;

    public Novel(String genre) {
        this.genre = genre;
    }

    public Novel(String title, String autor, double price, String genre) {
        super(title, autor, price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Género: "+this.genre);
    }
}
