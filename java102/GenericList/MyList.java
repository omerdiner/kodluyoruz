package GenericList;

import java.util.Arrays;

public class MyList<T> {
    private int capacity;
    private T[] arr;
    private T[] tmp;

    public MyList() {
        this.capacity = 10;
        arr = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size() {
        int i = 0;
        while (i < capacity && arr[i] != null) {
            i++;
        }
        return i;
    }

    public void add(T data) {
        if (size() == capacity) {
            tmp = arr;
            capacity = capacity * 2;
            arr = (T[]) new Object[capacity];
            arr = Arrays.copyOf(tmp, capacity);
        }

        arr[size()] = data;

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T get(int index) {
        if (index < 0 || index >= size()) {
            return null;
        } else {
            return arr[index];
        }
    }

    public T set(int index, T data) {
        T changed = data;
        if (index < 0 || index >= size()) {
            return null;
        } else {
            arr[index] = data;
        }
        return changed;
    }

    public T remove(int index) {
        T removed = arr[index];
        if (index < 0 || index >= size()) {
            return null;
        } else {
            for (int i = index; i < size(); i++) {
                arr[i] = arr[i + 1];
            }
            arr[size() - 1] = null;

        }
        return removed;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    int indexOf(T data) {
        for (int i = 0; i < size(); i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size() - 1; i >= 0; i--) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public T[] toArray() {
        return arr;
    }

    public void clear() {
        this.capacity = 10;
        arr = (T[]) new Object[capacity];
    }

    public boolean contains(T data) {
        for (T t : arr) {
            if (t == data) {
                return true;
            }
        }
        return false;
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> subList = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            subList.add(arr[i]);
        }
        return subList;
    }

}
