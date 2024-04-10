package Agregacion;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Marcos Gutierrez","Cajero");
        Employee e2 = new Employee("Lucia Fernandez","Cajero");
        Employee e3 = new Employee("Lucas Palermo","Conserje");
        Employee e4 = new Employee("Micaela Diaz","Conserje");

        Deparment d1 = new Deparment("Departamento 1");
        Deparment d2 = new Deparment("Departamento 2");

        Company c1 = new Company();

        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d2.addEmployee(e3);
        d2.addEmployee(e4);

        c1.addDepartments(d1);
        c1.addDepartments(d2);

        System.out.println(c1.getDepartments().get(0).getName());
        System.out.println(c1.getDepartments().get(0).getEmployees().get(0).getName());
        System.out.println(c1.getDepartments().get(0).getEmployees().get(1).getName()+"\n");

        System.out.println(c1.getDepartments().get(1).getName());
        System.out.println(c1.getDepartments().get(1).getEmployees().get(0).getName());
        System.out.println(c1.getDepartments().get(1).getEmployees().get(1).getName());

    }
}
