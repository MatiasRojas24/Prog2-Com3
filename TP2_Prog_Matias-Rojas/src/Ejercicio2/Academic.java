package Ejercicio2;

public class Academic extends Book{
    private String university;

    public Academic(String university) {
        this.university = university;
    }

    public Academic(int id, String title, String autor, int yearOfPublication, String university) {
        super(id, title, autor, yearOfPublication);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString()+"Tipo: Universitario"+'\n'+
                "Universidad: "+this.university+'\n';
    }
}
