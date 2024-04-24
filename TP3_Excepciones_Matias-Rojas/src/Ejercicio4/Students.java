package Ejercicio4;

import java.util.HashSet;
import java.util.Iterator;

public class Students implements Iterable<Student>{
    private HashSet<Student> studentsList;

    public Students() {
        this.studentsList = new HashSet<>();
    }

    public HashSet<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(HashSet<Student> studentsList) {
        this.studentsList = studentsList;
    }
    public void addStudent(Student student){
        studentsList.add(student);
        System.out.println("Se ha agregado al alumno correctamente"+"\n");
    }
    public int getStudentsListSize(){
        return studentsList.size();
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentsIterator(studentsList);
    }
}