package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Weekdays weekdays = new Weekdays();

        weekdays.addDay(4,"Juernes");

        System.out.println(weekdays.getWeekdays().get(3)+", "+weekdays.getWeekdays().get(4)+"\n");

        System.out.println(weekdays.getWeekdays().get(0)+", "+weekdays.getWeekdays().get(weekdays.getWeekdays().size()-1)+"\n");

        System.out.println("Días de la semana: ");
        for (String day : weekdays){
            System.out.println(day);
        }
        System.out.println();

        weekdays.removeWeekday("Juernes");

        System.out.println("Días de la semana: ");
        for (String day : weekdays){
            System.out.println(day);
        }
        System.out.println();

        weekdays.weekdaysContains("Lunes");

        weekdays.removeAllWeekdays();

        for (String day : weekdays){
            System.out.println(day);
        }
    }
}
