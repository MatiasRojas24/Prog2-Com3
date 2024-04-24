package Ejercicio5;

public class Task implements Comparable<Task>{
    private int priority;
    private String description;

    public Task() {
    }

    public Task(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Prioridad de la tarea: "+this.priority+"\n"+
                "Descripción de la tarea: "+this.description;
    }

    @Override
    public int compareTo(Task o) {
        return this.priority - o.getPriority();
    }
}

