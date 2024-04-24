package Ejercicio5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TaskList implements Iterable<Task> {
    private TreeSet<Task> tasks;

    public TaskList() {
        this.tasks = new TreeSet<>(Comparator.comparingInt(Task::getPriority).reversed());
    }
    public void addTask(Task task) {
        this.tasks.add(task);
    }
    public void removeTask(Task task) {
        this.tasks.remove(task);
    }
    public int getTaskAmount(){
        return this.tasks.size();
    }

    @Override
    public Iterator<Task> iterator() {
        return new TaskIterator(tasks);
    }
}
