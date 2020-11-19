package ua.edu.ucu.collections.immutable;

import java.util.Arrays;

public class ImmutableArrayList implements ImmutableList {
    public Object[] array = {};
    public int size;
    public static int lastIndex = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public ImmutableArrayList(int capacityInit) {
        if (capacityInit > 0) {
            this.array = new Object[capacityInit];
        } else if (capacityInit == 0) {
            throw new IllegalArgumentException("unsuitable value");
        }
    }

    public ImmutableArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    public ImmutableArrayList(Object[] c) {
        this.array = new Object[DEFAULT_CAPACITY];

        array = Arrays.copyOf(array, c.length); // new buff size
        for (int i = 0; i < c.length; i++) {
            array[i] = c[i]; // copy all elements into the array
            lastIndex++;
        }
    }

    @Override
    public ImmutableList add(Object e) {
        add(size, e);
        return null;
    }

    @Override
    public ImmutableList add(int index, Object e) {
        checkIndex(index);
        // new buff size +1 for one element
//        array = Arrays.copyOf(array, size++);

        // copy array by shifting elements
        // with ind > index to the right
        System.arraycopy(array, index, array,
                index + 1, size - index);
        array[index] = e;
        return null;
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        addAll(size, c);
        return null;
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        checkIndex(index);
        if (c.length == 0) {
            return null;
        }
        // make empty space for coping
        System.arraycopy(array, index, array,
                index + c.length, size - index);
        // copy elements from the given array
        // to the new empty space of the array list
        System.arraycopy(c, 0, array,
                index, index + c.length);
        return null;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public ImmutableList remove(int index) {
        set(index, null);
        return null;
    }

    @Override
    public ImmutableList set(int index, Object e) {
        checkIndex(index);
        array[index] = e;
        return null;
    }

    @Override
    public int indexOf(Object e) {
        // returns the index of the element in the array list
        int ind = 0;
        for (Object el : array) {
            if (el.equals(e)) {
                return ind;
            }
            ind++;
        }
        throw new IndexOutOfBoundsException("no such element found");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ImmutableList clear() {
        for (int i = 0; i < lastIndex + 1; i++) { // check if +1 is needed
            array[i] = null;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object[] toArray() {
//        Arrays.copyOf(array, size); // ??
        return Arrays.copyOf(array, size);
    }

    public void checkIndex(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("illegal index");
        }
    }
}
