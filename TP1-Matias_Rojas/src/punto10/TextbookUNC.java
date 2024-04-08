package punto10;

public class TextbookUNC extends Textbook{
    private String school;

    public TextbookUNC(String grade, String school) {
        super(grade);
        this.school = school;
    }

    public TextbookUNC(String title, String autor, double price, String grade, String school) {
        super(title, autor, price, grade);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Facultad: "+this.school);
    }
}
