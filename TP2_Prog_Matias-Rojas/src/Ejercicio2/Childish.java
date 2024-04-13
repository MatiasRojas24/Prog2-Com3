package Ejercicio2;

public class Childish extends Book{
    private int recommenddAge;

    public Childish(int recommenddAge) {
        this.recommenddAge = recommenddAge;
    }

    public Childish(int id, String title, String autor, int yearOfPublication, int recommenddAge) {
        super(id, title, autor, yearOfPublication);
        this.recommenddAge = recommenddAge;
    }

    public int getRecommenddAge() {
        return recommenddAge;
    }

    public void setRecommenddAge(int recommenddAge) {
        this.recommenddAge = recommenddAge;
    }

    @Override
    public String toString() {
        return super.toString()+"Tipo: Infantil"+'\n'+
                "Edad recomendada: "+this.recommenddAge+'\n';
    }
}
