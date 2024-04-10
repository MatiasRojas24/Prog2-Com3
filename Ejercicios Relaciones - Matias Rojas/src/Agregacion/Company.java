package Agregacion;

import java.util.ArrayList;

public class Company {
    private ArrayList<Deparment> departments = new ArrayList<>();

    public Company() {
    }

    public ArrayList<Deparment> getDepartments() {
        return departments;
    }
    public void addDepartments(Deparment department) {
        departments.add(department);
    }
}
