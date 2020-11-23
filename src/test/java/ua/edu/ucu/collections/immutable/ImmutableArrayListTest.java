package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    
    @Test
    public void testAdd() {
        ImmutableList immutableList = new ImmutableArrayList();
        ImmutableList newImmutableList = immutableList.add("abc");

        assertNull(immutableList.toArray()[0]);
        assertEquals("abc", newImmutableList.toArray()[0]);
    }

    @Test
    public void testAddIndex() {
        ImmutableList immutableList = new ImmutableArrayList();
        ImmutableList newImmutableList = immutableList.add(1,"abc");

        assertNull(immutableList.toArray()[1]);
        assertEquals("abc", newImmutableList.toArray()[1]);
    }

    @Test
    public void testAddAll() {
        ImmutableList immutableList = new ImmutableArrayList();

        Object[] obj = new Object[2];
        obj[0] = "abc";
        obj[1] = "ABC";

        ImmutableList newImmutableList = immutableList.addAll(obj);

        assertNull(immutableList.toArray()[0]);
        assertEquals("abc", newImmutableList.toArray()[0]);
        assertEquals("ABC", newImmutableList.toArray()[1]);
    }

    @Test
    public void testAddAllIndex() {
        ImmutableList immutableList = new ImmutableArrayList();

        Object[] obj = new Object[2];
        obj[0] = "abc";
        obj[1] = "ABC";

        ImmutableList newImmutableList = immutableList.addAll(1, obj);

        assertNull(immutableList.toArray()[1]);
        assertEquals("abc", newImmutableList.toArray()[1]);
        assertEquals("ABC", newImmutableList.toArray()[2]);
    }

    @Test
    public void testGet() {
        ImmutableList immutableList = new ImmutableArrayList();
        ImmutableList newImmutableList = immutableList.add(1,"abc");

        Object resObj = newImmutableList.get(1);

        assertEquals(resObj, "abc");
    }

    @Test
    public void testRemove() {
        Object[] obj = new Object[2];
        obj[0] = "abc";

        ImmutableList immutableList = new ImmutableArrayList(obj);
        ImmutableList newImmutableList = immutableList.remove(0);

        Object resObj = newImmutableList.get(0);

        assertNull(resObj);
    }

    @Test
    public void testSet() {
        ImmutableList immutableList = new ImmutableArrayList();
        ImmutableList newImmutableList = immutableList.set(0, "abc");

        Object resObj = newImmutableList.get(0);

        assertEquals("abc", resObj);
    }

    @Test
    public void testIndex() {
        ImmutableList immutableList = new ImmutableArrayList();
        ImmutableList newImmutableList = immutableList.add("abc");

        Object resObj = newImmutableList.indexOf("abc");

        assertEquals(0, resObj);
    }

    @Test
    public void testSize() {
        ImmutableList immutableList = new ImmutableArrayList();
        int size = immutableList.size();

        assertEquals(10, size);
    }

    @Test
    public void testClear() {
        Object[] obj = new Object[2];
        obj[0] = "abc";

        ImmutableList immutableList = new ImmutableArrayList(obj);
        ImmutableList newImmutableList = immutableList.clear();

        assertNull(newImmutableList.toArray()[0]);
    }

    @Test
    public void testIsEmpty() {
        ImmutableList immutableList = new ImmutableArrayList(0);

        assertTrue(immutableList.isEmpty());
    }

    @Test
    public void testToArray() {
        ImmutableList immutableList = new ImmutableArrayList();
        ImmutableList newImmutableList = immutableList.add("abc");
        Object[] obj = new Object[11];
        obj[0] = "abc";

        assertArrayEquals(obj, newImmutableList.toArray());
    }

    @Test
    public void testCheckIndex() {
        ImmutableList immutableList = new ImmutableArrayList();
        ImmutableList newImmutableList = immutableList.add("abc");
        Object[] obj = new Object[11];
        obj[0] = "abc";

        assertArrayEquals(obj, newImmutableList.toArray());
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testGetLastIndex() {
        ImmutableArrayList immutableList = new ImmutableArrayList();
        immutableList.checkIndex(11);
    }

    
}
