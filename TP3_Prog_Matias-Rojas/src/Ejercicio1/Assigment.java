package Ejercicio1;

public class Assigment {
    private String name;
    private int classroom;
    private String time;
    private Teacher teacher;
    private Group group;

    public Assigment(String name, int classroom, String time) {
        this.name = name;
        this.classroom = classroom;
        this.time = time;
    }
    public Assigment(String name, int classroom, String time, Teacher teacher, Group group) {
        this.name = name;
        this.classroom = classroom;
        this.time = time;
        this.teacher = teacher;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getTime() {
        return time;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Group getGroup() {
        return group;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Nombre de la asignatura: "+this.name+"\n"+
                "Horario de cursado: "+this.time+"\n"+
                "Aula de cursado: "+this.classroom+"\n"+
                "Profesor/a: "+this.teacher.getName()+"\n"+
                "Grupo: "+this.group.getGradeNum()+this.group.getLetter()+"\n";
    }
}
