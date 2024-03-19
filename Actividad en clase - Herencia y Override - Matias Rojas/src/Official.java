public class Official extends Operator{
   private int edad;

    public Official(String dni, int edad) {
        super(dni);
        this.edad = edad;
    }

    public Official(String name, String dni, int edad) {
        super(name, dni);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString()+ " - Edad: "+edad;
    }

    @Override
    public void trabajar() {
        System.out.println("El oficial trabaja");
    }
    public void cobrarSueldo(){
        System.out.println("El oficial cobra su sueldo");
    }
}
