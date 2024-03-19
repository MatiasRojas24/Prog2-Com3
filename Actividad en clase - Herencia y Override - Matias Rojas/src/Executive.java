public class Executive extends Employee {
    private String dni;

    public Executive(String dni) {
        this.dni = dni;
    }

    public Executive(String name, String dni) {
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
        return super.toString() + " - DNI: " + dni;
    }
    public void trabajar(){
        System.out.println("El directivo trabaja");
    }
}
