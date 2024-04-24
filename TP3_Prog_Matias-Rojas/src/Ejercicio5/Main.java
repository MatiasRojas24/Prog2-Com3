package Ejercicio5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String description;
        int priority;
        int option;
        TaskList taskList = new TaskList();
        boolean active = true;

        while (active) {
            System.out.println("Qué desea hacer?");
            System.out.println("1. Agregar una tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Borrar tarea");
            System.out.println("4. Consultar número total de tareas");
            System.out.println("0. Cerrar el programa");
            option = sc.nextInt();
            System.out.println();

            switch (option){
                case 1:
                    System.out.println("Ingrese la descripción de la tarea a agregar: ");
                    description = sc.nextLine();
                    description = sc.nextLine();
                    System.out.println("Indique la prioridad de la tarea: ");
                    priority = sc.nextInt();
                    taskList.addTask(new Task(priority,description));
                    System.out.println("Se ha agregado la tarea correctamente! "+"\n");
                    break;
                case 2:
                    System.out.println("Tareas: ");
                    for (Task task : taskList){
                        System.out.println(task);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ingrese la descripción de la tarea a eliminar: ");
                    description = sc.nextLine();
                    description = sc.nextLine();
                    for (Task task : taskList){
                        if(description.equalsIgnoreCase(task.getDescription())){
                            taskList.removeTask(task);
                            System.out.println("Se ha eliminado la tarea correctamente! "+"\n");
                            break;
                        }
                    }

                    System.out.println();
                    break;
                case 4:
                    System.out.println("El número total de tareas es de: "+taskList.getTaskAmount()+"\n");
                    break;
                case 0:
                    System.out.println("Cerrando el programa...");
                    active = false;
                    break;
            }
        }



    }
}
