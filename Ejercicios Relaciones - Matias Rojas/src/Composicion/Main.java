package Composicion;

public class Main {
    public static void main(String[] args) {
        House h1 = new House("madera",3);
        h1.addDoors("Vidrio",2);
        for(int i = 0; i<h1.getDoors().size(); i++){
            System.out.println("Puerta "+(i+1)+": ");
            System.out.println("Material: "+h1.getDoors().get(i).getMaterial());
        }
    }
}
