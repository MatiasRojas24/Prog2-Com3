package Ejercicio4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double gradeAvg;
        double highestGrade;
        String name;
        int age;
        double grade;
        Scanner sc = new Scanner(System.in);
        Students students = new Students();
        boolean active = true;
        int option;

        while (active){
            System.out.println("Qué desea hacer?");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Listar alumnos");
            System.out.println("3. Calcular y mostrar media de notas");
            System.out.println("4. Mostrar el alumno con la nota más alta");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("0. Cerrar el programa");
            try {
                option = sc.nextInt();
                validateOption(option);
                System.out.println();

                switch (option) {
                    case 1:
                        try {
                            System.out.println("Ingrese el nombre del alumno: ");
                            name = sc.nextLine();
                            name = sc.nextLine();
                            System.out.println("Ingrese la edad del alumno: ");
                            age = sc.nextInt();
                            validateAge(age);
                            System.out.println("Ingrese la nota del alumno: ");
                            grade = sc.nextDouble();
                            validateGrade(grade);
                            students.addStudent(new Student(name, age, grade));
                        } catch (Exceptions.InvalidAge | Exceptions.InvalidGrade e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("Lista de alumnos: ");
                        for (Student student : students) {
                            System.out.println(student);
                        }
                        System.out.println();
                        break;
                    case 3:
                        gradeAvg = 0;
                        for (Student student : students) {
                            gradeAvg += student.getGrade();
                        }
                        gradeAvg = gradeAvg / students.getStudentsListSize();
                        System.out.println("El promedio de las notas de los alumnos es: " + gradeAvg + "\n");
                        break;
                    case 4:
                        highestGrade = 0;
                        for (Student student : students) {
                            if (highestGrade < student.getGrade()) {
                                highestGrade = student.getGrade();
                            }
                        }
                        for (Student student : students) {
                            if (highestGrade == student.getGrade()) {
                                System.out.println("El alumno con la nota más alta es: " + "\n" + student);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Ingrese el nombre del alumno a buscar: ");
                        name = sc.nextLine();
                        name = sc.nextLine();
                        for (Student student : students) {
                            if (name.equalsIgnoreCase(student.getName())) {
                                System.out.println(student);
                                System.out.println();
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Cerrando el programa...");
                        active = false;
                        break;
                }
            }catch (Exceptions.InvalidOption e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void validateAge(int age) throws Ejercicio4.Exceptions.InvalidAge {
        if (age < 5 || age >  70){
            throw new Exceptions.InvalidAge("Edad inválida, debe ser mayor a 5 y menor a 70"+"\n");
        }
    }
    public static void validateGrade(double grade) throws Ejercicio4.Exceptions.InvalidGrade{
        if (grade < 1 || grade > 10){
            throw new Exceptions.InvalidGrade("Nota inválida."+"\n");
        }
    }
    public static void validateOption(int option) throws Ejercicio4.Exceptions.InvalidOption{
        if (option < 0 || option > 5){
            throw new Exceptions.InvalidOption("Opción inválida."+"\n");
        }
    }
}