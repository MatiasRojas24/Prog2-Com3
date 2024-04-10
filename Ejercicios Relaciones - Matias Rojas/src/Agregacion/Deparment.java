package Agregacion;

import java.util.ArrayList;

public class Deparment {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Deparment() {
    }

    public Deparment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
}
