package Ejercicio1;

import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<Group> groups;
    public Student() {
    }
    public Student(String name, String dni) {
        super(name, dni);
        this.groups = new ArrayList<>();
    }
    public void addGroup(Group group) {
        this.groups.add(group);
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Estudiante: "+"\n"+
                "Nombre: "+this.getName()+"\n"+
                "DNI: "+this.getDni()+"\n";
    }
}
