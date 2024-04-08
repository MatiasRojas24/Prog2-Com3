package punto10;

public class Textbook extends Book{
    private String grade;

    public Textbook(String grade) {
        this.grade = grade;
    }

    public Textbook(String title, String autor, double price, String grade) {
        super(title, autor, price);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Curso: "+this.grade);
    }
}
