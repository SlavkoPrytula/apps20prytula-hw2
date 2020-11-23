package ua.edu.ucu.collections.immutable;

import java.util.Arrays;

public final class ImmutableArrayList implements ImmutableList {
    static final int DEFAULT_CAPACITY = 10;
    private final Object[] array;
    public static int size;

    public int getLastIndex() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return array.length;
    }

//    public static int lastIndex = 0;
    //    /**
    //     * Create ImmutableArrayList with defined size
    //     */
    public ImmutableArrayList(int capacityInit) {
        this.array = new Object[capacityInit];
        size = capacityInit;
    }
//
//    /**
//     * Create ImmutableArrayList with default size 10
//     */

    public ImmutableArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        size = DEFAULT_CAPACITY;
    }

    /**
     * Create ImmutableArrayList from a given array
     */
    public ImmutableArrayList(Object[] c) {
        this.array = c;
        size = 1;
    }

    @Override
    public ImmutableList add(Object e) {
        return add(getLastIndex(), e);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        checkIndex(index);
        // copy array by shifting elements
        // with ind > index to the right
        Object[] newArray = new Object[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);

        System.arraycopy(newArray, index, newArray,
                index + 1, newArray.length - index - 1);
        newArray[index] = e;

        return new ImmutableArrayList(newArray);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return addAll(getLastIndex(), c);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        checkIndex(index);
        Object[] newArray = new Object[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        if (c.length == 0) {
            return new ImmutableArrayList(newArray);
        }
        if (getLastIndex() == size())
            newArray = Arrays.copyOf(newArray, newArray.length + c.length);
        // make empty space for coping
        // copy elements from the given array
        // to the new empty space of the array list
        System.out.println(index);
        System.out.println(newArray.length);
        System.arraycopy(c, 0, newArray,
                index, c.length);
        return new ImmutableArrayList(newArray);
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public ImmutableList remove(int index) {
        return set(index, null);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        checkIndex(index);
        Object[] newArray = new Object[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[index] = e;
        return new ImmutableArrayList(newArray);
    }

    @Override
    public int indexOf(Object e) {
        // returns the index of the element in the array list
        int ind = 0;
        for (Object el : array) {
            if (el != null && el.equals(e)) {
                return ind;
            }
            ind++;
        }
        throw new IndexOutOfBoundsException("no such element found");
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public ImmutableList clear() {
        Object[] newArray = new Object[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        for (int i = 0; i < getLastIndex()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               + 1; i++) { // check if +1 is needed
            newArray[i] = null;
        }
        return new ImmutableArrayList(newArray);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, size());
    }

    public void checkIndex(int index) {
        if (index > size()) {
            throw new IndexOutOfBoundsException("illegal index");
        }
    }
}
