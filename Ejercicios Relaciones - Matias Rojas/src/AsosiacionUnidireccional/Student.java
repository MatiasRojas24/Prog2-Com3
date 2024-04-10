package AsosiacionUnidireccional;

public class Student {
    private String name;
    private University university;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public University getUniversity() {
        return university;
    }
    public void changeUni(University newUniversity){
        this.university = newUniversity;
    }
}
