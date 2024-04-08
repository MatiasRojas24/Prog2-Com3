package punto8;

public class Worker extends Employee{
    private String area;

    public Worker(String area) {
        this.area = area;
    }

    public Worker(String name, int age, int salary, String area) {
        super(name, age, salary);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void produce(){
        System.out.println(this.name+" produce en el área de "+this.area);
    }
}
