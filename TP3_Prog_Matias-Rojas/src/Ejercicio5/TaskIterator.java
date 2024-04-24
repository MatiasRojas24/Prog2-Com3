package Ejercicio5;

import java.util.Iterator;
import java.util.TreeSet;

public class TaskIterator implements Iterator<Task> {
    private TreeSet<Task> tasksList;
    private int index;

    public TaskIterator(TreeSet<Task> tasksList) {
        this.tasksList = tasksList;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < tasksList.size();
    }
    @Override
    public Task next() {
        return (Task) tasksList.toArray()[index++];
    }
}
