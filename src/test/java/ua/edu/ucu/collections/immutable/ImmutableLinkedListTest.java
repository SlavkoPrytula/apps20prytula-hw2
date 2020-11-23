package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    @Test
    public void testAdd() {
        ImmutableList immutableList = new ImmutableLinkedList();
        ImmutableList newImmutableList = immutableList.add("abc");

        assertNotNull(newImmutableList.get(0));
    }

//    @Test
//    public void testAddIndex() {
//        ImmutableList immutableList = new ImmutableLinkedList();
//        ImmutableList newImmutableList = immutableList.add(1,"abc");
//
//        assertNotNull(newImmutableList.get(1));
//    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndex() {
        ImmutableList immutableList = new ImmutableLinkedList();
        ImmutableList newImmutableList = immutableList.add(1,"abc");
    }
//
//    @Test
//    public void testAddAll() {
//        ImmutableList immutableList = new ImmutableLinkedList();
//
//        Object[] obj = new Object[2];
//        obj[0] = "abc";
//        obj[1] = "ABC";
//
//        ImmutableList newImmutableList = immutableList.addAll(obj);
//
//        assertNotNull(newImmutableList.get(0));
//        assertNotNull(newImmutableList.get(1));
//    }

//    @Test
//    public void testAddAllIndex() {
//        ImmutableList immutableList = new ImmutableLinkedList();
//
//        Object[] obj = new Object[2];
//        obj[0] = "abc";
//        obj[1] = "ABC";
//
//        ImmutableList newImmutableList = immutableList.addAll(1, obj);
//
//        assertNotNull(newImmutableList.get(1));
//    }

    @Test
    public void testGet() {
        ImmutableList immutableList = new ImmutableLinkedList();
        ImmutableList newImmutableList = immutableList.add(0,"abc");

        Object resObj = newImmutableList.get(0);

        assertNotNull(resObj);
    }

    @Test
    public void testRemove() {
        Object[] obj = new Object[2];
        obj[0] = "abc";

        ImmutableList immutableList = new ImmutableLinkedList(obj);
        ImmutableList newImmutableList = immutableList.remove(0);

        Object resObj = newImmutableList.get(0);

        assertNotNull(resObj);
    }

//    @Test
//    public void testSet() {
//        ImmutableList immutableList = new ImmutableLinkedList();
//        ImmutableList newImmutableList = immutableList.add(0, "abc");
//        ImmutableList newImmutableList1 = newImmutableList.set(0, "abcksk");
//
//        Object resObj = newImmutableList1.get(0);
//
//        assertNull(resObj);
//    }

//    @Test
//    public void testIndex() {
//        ImmutableList immutableList = new ImmutableLinkedList();
//        ImmutableList newImmutableList = immutableList.add(2,"abc");
//
//        Object resObj = newImmutableList.indexOf("abc");
//
//        assertEquals(2, resObj);
//    }

    @Test
    public void testSize() {
        ImmutableList immutableList = new ImmutableLinkedList();
        int size = immutableList.size();

        assertEquals(0, size);
    }

    @Test
    public void testClear() {
        Object[] obj = new Object[2];
        obj[0] = "abc";

        ImmutableList immutableList = new ImmutableLinkedList(obj);
        ImmutableList newImmutableList = immutableList.clear();

        assertNull(newImmutableList.get(0));
    }

    @Test
    public void testIsEmpty() {
        ImmutableList immutableList = new ImmutableLinkedList();

        assertTrue(immutableList.isEmpty());
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFirst() {
        ImmutableLinkedList immutableList = new ImmutableLinkedList();

        immutableList.getFirst();
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLast() {
        ImmutableLinkedList immutableList = new ImmutableLinkedList();

        immutableList.getLast();
    }

    @Test
    public void testRemoveFirst() {
        Object[] obj = new Object[2];
        obj[0] = "abc";
        ImmutableLinkedList immutableList = new ImmutableLinkedList(obj);
        ImmutableLinkedList newImmutableList = immutableList.removeLast();
        assertNotNull(newImmutableList.get(0));
    }

    @Test
    public void testRemoveLast() {
        Object[] obj = new Object[2];
        obj[0] = "abc";
        ImmutableLinkedList immutableList = new ImmutableLinkedList(obj);
        ImmutableLinkedList newImmutableList = immutableList.removeLast();
        assertNotNull(newImmutableList.get(0));
    }

    @Test
    public void testToArray() {
        Object[] obj = new Object[2];
        obj[0] = "abc";

        ImmutableList immutableList = new ImmutableLinkedList(obj);
        System.out.println(Arrays.toString(immutableList.toArray()));

        assertNotNull(immutableList.get(0));
    }
    
}
