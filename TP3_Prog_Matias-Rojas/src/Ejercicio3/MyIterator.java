package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator<String> implements Iterator{
    private ArrayList<String> elements;
    private int index = 0;

    public MyIterator(ArrayList<String> elements) {
        this.elements = elements;
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        return index < elements.size();
    }

    @Override
    public Object next() {
        return elements.get(index++);
    }
}
