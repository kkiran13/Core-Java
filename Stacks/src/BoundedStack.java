import java.util.NoSuchElementException;

/**
 * An implementation of a stack using a fixed, non-expandable array whose
 * capacity is set in its constructor.
 */
public class BoundedStack{
    private Object[] array;
    private int size = 0;

    public BoundedStack(int capacity) {
        array = new Object[capacity];
    }

    public void push(Object item) {
        if (size == array.length) {
            throw new IllegalStateException("Cannot add to full stack");
        }
        array[size++] = item;
    }

    public Object pop() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot pop from empty stack");
        }
        Object result = array[size-1];
        array[--size] = null;
        return result;
    }

    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot peek into empty stack");
        }
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}