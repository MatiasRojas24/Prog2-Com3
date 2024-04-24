package Ejercicio4;

import java.util.HashSet;
import java.util.Iterator;

public class StudentsIterator implements Iterator<Student> {
    private HashSet<Student> students;
    private int index;

    public StudentsIterator(HashSet<Student> students) {
        this.students = students;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }
    @Override
    public Student next() {
        return (Student) students.toArray()[index++];
    }
}
