public class Stack2<T> {

    private int size;
    private int capacity;
    private T[] array;

    @SuppressWarnings("unchecked")
    public Stack() {
        this.capacity = 5;
        this.array = (T[]) new Object[capacity];
    }

    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    public void push(T data) {
        if (size >= capacity) {
            throw new IllegalStateException("Stack Overflow");
        }
        array[size++] = data;
    }

    public T pop() {
        if (size <= 0) {
            throw new IllegalStateException("Stack Underflow");
        }
        T data = array[--size];
        array[size] = null;
        return data;
    }

    public void insert(int index, T data) {
        if (size >= capacity) {
            throw new IllegalStateException("Stack Overflow");
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = data;
        size++;
    }

    public int search(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public String toReversedString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = size - 1; i >= 0; i--) {
            sb.append(array[i]);
            if (i > 0) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
