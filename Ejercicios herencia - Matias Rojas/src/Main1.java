import java.util.Collections;
import java.util.List;
public class Main1 {
    public static void main(String[] args) {

        Car c1 = new Car("rojo", 4, 80, 2500);
        Truck t1 = new Truck("blanco", 6, 500);
        Bicycle b1 = new Bicycle("negro", 2, "deportiva");
        Motorcycle m1 = new Motorcycle("marrón", 2, 120, 600);
        List<Vehicle> Vehicles = List.of(c1,t1,b1,m1);


       //

        catalog(Vehicles, 2);
    }
    public static void catalog(List<Vehicle> vehicles, int wheelsAmount) {
        int vehiclesCoincidence = 0;
        if (wheelsAmount == 0){
            System.out.println("No hay vehículos con 0 ruedas");
        }
        for (Vehicle vehicle : vehicles) {
            if (wheelsAmount != 0  && vehicle.getWheels() == wheelsAmount){
                vehiclesCoincidence ++;
                System.out.println("Clase: "+vehicle.getClass().getSimpleName() + " - " + vehicle);
            }
        }
        if (wheelsAmount != 0 && vehiclesCoincidence > 1){
            System.out.println("Se han encontrado "+vehiclesCoincidence+" vehículos con "+wheelsAmount+" ruedas");
        }else if(wheelsAmount != 0 && vehiclesCoincidence == 1){
            System.out.println("Se ha encontrado "+vehiclesCoincidence+" vehículo con "+wheelsAmount+" ruedas");
        }
    }
}

