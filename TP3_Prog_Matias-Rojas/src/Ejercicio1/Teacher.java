package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Teacher extends Person{
    private String department;
    private ArrayList<Assigment> assigments;
    public Teacher(String department) {
        this.department = department;
        this.assigments = new ArrayList<>();
    }

    public Teacher(String name, String dni, String department) {
        super(name, dni);
        this.department = department;
        this.assigments = new ArrayList<>();

    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<Assigment> getAssigments() {
        return assigments;
    }

    public void setAssigments(ArrayList<Assigment> assigments) {
        this.assigments = assigments;
    }

    public void addAssignments(Assigment assigment){
        this.assigments.add(assigment);
    }
    @Override
    public String toString() {
        return "Profesor/a: "+"\n"+
                "Nombre: "+this.getName()+"\n"+
                "DNI: "+this.getDni()+"\n"+
                "Departamento: "+this.department+"\n";
    }

}
