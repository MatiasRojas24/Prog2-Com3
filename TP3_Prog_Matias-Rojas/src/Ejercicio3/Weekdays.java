package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class Weekdays implements Iterable<String>{
    private ArrayList<String> weekdays;

    public Weekdays() {
        this.weekdays = new ArrayList<>();
        this.weekdays.add(0,"lunes");
        this.weekdays.add(1,"MARTES");
        this.weekdays.add(2,"Miércoles");
        this.weekdays.add(3,"Jueves");
        this.weekdays.add(4,"Viernes");
        this.weekdays.add(5,"Sábado");
        this.weekdays.add(6,"Domingo");
    }

    public ArrayList<String> getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(ArrayList<String> weekdays) {
        this.weekdays = weekdays;
    }

    public void addDay(int index, String day){
        if (index >= 0 && index <= 6) {
            this.weekdays.add(index, day);
        }
    }

    public void weekdaysContains(String day){
        if (this.weekdays.contains(day) || this.weekdays.contains(day.toLowerCase()) || this.weekdays.contains(day.toUpperCase())) {
            System.out.println("El día '"+day+"' se encuentra en los días de la semana"+"\n");
        } else {
            System.out.println("El día '"+day+"' NO se encuentra en los días de la semana"+"\n");        }
    }

    public void removeWeekday(String day) {
        this.weekdays.remove(day);
        System.out.println("Se ha eliminado el día '"+day+"'"+"\n");
    }

    public void removeAllWeekdays(){
        this.weekdays.clear();
        System.out.println("Se han eliminado todos los días de la semana"+"\n");
    }
    @Override
    public Iterator<String> iterator() {
        return new MyIterator(weekdays);
    }
}
