package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Juan Alvarez");
        Employee e2 = new Employee("José González");

        e1.assignSupervisor(e2);

        System.out.println("Supervisor de "+e1.getName()+": "+e1.getSupervisorName());
        System.out.println("Supervisor de "+e2.getName()+": "+e2.getSupervisorName());
    }
}
