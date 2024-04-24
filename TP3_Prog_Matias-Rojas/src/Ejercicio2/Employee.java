package Ejercicio2;

public class Employee {
    private String name;
    private Employee supervisor;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupervisorName() {
        if (this.supervisor != null){
            return this.supervisor.getName();
        }else{
            return "Sin supervisor";
        }
    }

    public void assignSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }
}
