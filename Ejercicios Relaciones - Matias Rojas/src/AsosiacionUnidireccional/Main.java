package AsosiacionUnidireccional;

public class Main {
    public static void main(String[] args) {
        University n1 = new University("Universidad Técnológica Nacional");
        University n2 = new University("Universidad del Aconcagua");
        Student s1 = new Student("José Hernández");
        Student s2 = new Student("Fernando Mansilla");

        s1.changeUni(n2);
        s2.changeUni(n1);

        System.out.println(s2.getName()+" asiste a la universidad: "+s1.getUniversity().getName());
        System.out.println(s1.getName()+" asiste a la universidad: "+s1.getUniversity().getName());
    }
}
