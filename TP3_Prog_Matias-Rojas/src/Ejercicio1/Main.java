package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String assingmentInput;
        Scanner sc = new Scanner(System.in);

        Teacher t1 = new Teacher("Micaela López", "29793301", "departamento1");

        Assigment a1 = new Assigment("Laboratorio de computación", 1, "08:00");
        Assigment a2 = new Assigment("Arquitectura de sistemas operativos", 2, "08:00");
        Assigment a3 = new Assigment("Programación", 1, "10:00");

        Student st1 = new Student("Emiliano Montenegro","46327091");
        Student st2 = new Student("Fernando Quiroga","44230181");
        Student st3 = new Student("Gabriel Lema","46282006");
        Student st4 = new Student("Carla Hurtado","45760489");
        Student st5 = new Student("Teresa Martinez","39857026");
        Student st6 = new Student("Ana Bario","42392015");

        Group g1 = new Group("3",'B',st1);
        Group g2 = new Group("1",'A',st2);

        //Asignar estudiantes a grupo
        g1.addStudent(st3);
        g1.addStudent(st4);
        g2.addStudent(st5);
        g2.addStudent(st6);
        g2.addStudent(st1);

        //Asignar grupo a estudiantes
        st1.addGroup(g1);
        st3.addGroup(g1);
        st4.addGroup(g1);

        st1.addGroup(g2);
        st2.addGroup(g2);
        st5.addGroup(g2);
        st6.addGroup(g2);

        //Asignar materias a grupo
        g1.addAssignment(a1);
        g1.addAssignment(a2);
        g2.addAssignment(a3);

        //Asignar materias a profesor
        t1.addAssignments(a1);
        t1.addAssignments(a2);
        t1.addAssignments(a3);

        //Asignar profesor a materia
        a1.setTeacher(t1);
        a2.setTeacher(t1);
        a3.setTeacher(t1);

        //Asignar grupo a materia
        a1.setGroup(g1);
        a2.setGroup(g1);
        a3.setGroup(g2);


        // a-
        System.out.println("3ra asignatura del profesor/la profesora "+t1.getName()+": "+t1.getAssigments().get(3-1).getName()+"\n");

        // b-
        System.out.println("Asignaturas del profesor/la profesora "+t1.getName()+": ");
        for (Assigment assigment : t1.getAssigments()){
            System.out.println(assigment.getName());
        }
        System.out.println();

        // c-
        System.out.println("Alumnos del grupo "+a1.getGroup().getGradeNum()+a1.getGroup().getLetter()+" de la asignatura "+a1.getName()+": ");
        for (Student student : a1.getGroup().getStudents()){
            System.out.println(student);
        }
        System.out.println();

        // e-
        System.out.println("Asignaturas recibidas por el primer grupo del/de la estudiante "+st1.getName());
        for (Assigment assigment : st1.getGroups().get(0).getAssigments()){
            System.out.println(assigment);
        }
        System.out.println();

        // f-
        boolean studentCurses = false;
        System.out.println("Ingrese el nombre de una materia existente que el/la estudiante "+st5.getName()+" curse: ");
        assingmentInput = sc.nextLine();
        for (Group group : st5.getGroups()){
            for (Assigment assigment : group.getAssigments()){
                if (assingmentInput.equalsIgnoreCase(assigment.getName())){
                    System.out.println("El profesor que enseña la materia ingresada es: "+assigment.getTeacher().getName());
                    studentCurses = true;
                }
            }

        }
        if (!studentCurses){
            System.out.println("El alumno "+st5.getName()+" no cursa la materia ingresada");
            System.out.println();
        }

        // g-
        System.out.println("Estudiantes del grupo de la 2da materia del profesor/ la profesora "+t1.getName()+": ");
        for (Student student : t1.getAssigments().get(2-1).getGroup().getStudents()){
            System.out.println(student);
        }
        System.out.println();

    }

}
