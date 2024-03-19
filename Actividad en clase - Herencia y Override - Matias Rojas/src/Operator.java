public class Operator extends Employee{
    protected String dni;

    public Operator(String dni) {
        this.dni = dni;
    }

    public Operator(String name, String dni) {
        super(name);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return super.toString() + " - DNI: "+dni;
    }
    public void trabajar(){
        System.out.println("El operador trabaja");
    }
}
