package Ejercicio1;

import java.util.ArrayList;

public class Group {
    private String gradeNum;
    private Character letter;
    private ArrayList<Student> students;
    private ArrayList<Assigment> assigments;

    public Group(String gradeNum, Character letter, Student student) {
        this.gradeNum = gradeNum;
        this.letter = letter;
        this.assigments = new ArrayList<>();
        this.students = new ArrayList<>();
        this.students.add(student);
    }
    public Group(String gradeNum, Character letter, String studentName, String dni) {
        this.gradeNum = gradeNum;
        this.letter = letter;
        this.assigments = new ArrayList<>();
        this.students = new ArrayList<>();
        this.students.add(new Student(studentName,dni));
    }

    public String getGradeNum() {
        return gradeNum;
    }

    public void setGradeNum(String gradeNum) {
        this.gradeNum = gradeNum;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Assigment> getAssigments() {
        return assigments;
    }

    public void setAssigments(ArrayList<Assigment> assigments) {
        this.assigments = assigments;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
    public void addAssignment(Assigment assigment){
        this.assigments.add(assigment);
    }

    @Override
    public String toString() {
        return "Curso: "+this.gradeNum +"\n"+
                "Letra: "+this.letter+"\n";
    }
}
