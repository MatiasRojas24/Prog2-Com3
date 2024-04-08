package punto8;

public class Manager extends Employee{
    private String department;

    public Manager(String department) {
        this.department = department;
    }

    public Manager(String name, int age, int salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public String getDeparment() {
        return department;
    }

    public void setDeparment(String deparment) {
        this.department = deparment;
    }
    public void organizeActivities(){
        System.out.println(this.name+" organiza las actividades del departamento de "+this.department);
    }
}
