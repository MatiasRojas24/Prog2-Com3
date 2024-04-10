package Composicion;

import java.util.ArrayList;

public class House {
    private ArrayList<Door> doors = new ArrayList<>();

    public House(String material, int amount) {
        for (int i = 0; i <amount; i++){
            doors.add(new Door(material));
        }
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public void setDoors(ArrayList<Door> doors) {
        this.doors = doors;
    }

    public void addDoors(String material, int amount){
        for (int i = 0; i <amount; i++){
            doors.add(new Door(material));
        }
    }
}
