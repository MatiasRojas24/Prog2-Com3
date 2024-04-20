import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArraylist<T> implements Iterable<T> {
    private ArrayList<T> nums;

    public CollectionArraylist() {
        nums = new ArrayList<>(10);
    }

    public void addNum(T num) {
        nums.add(num);
    }
    public int getIndex(T num){
        return nums.indexOf(num);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(nums);
    }
    public class MyIterator<T> implements Iterator<T> {
        private List<T> nums;
        private int index = 0;

        public MyIterator(List<T> elementos) {
            this.nums = elementos;
        }

        @Override
        public boolean hasNext() {
            return index < nums.size();
        }

        @Override
        public T next() {
            return nums.get(index++);
        }
    }
}

